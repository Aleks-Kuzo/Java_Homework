import java.util.Scanner;
import java.util.Comparator;

class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // убывание
    }
}

class LastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getLastName().compareTo(s2.getLastName());
    }
}

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public void setArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = sc.nextInt();
        iDNumber = new Student[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Студент " + (i + 1) + ":");
            System.out.print("Имя: ");
            String firstName = sc.nextLine();
            System.out.print("Фамилия: ");
            String lastName = sc.nextLine();
            System.out.print("Специальность: ");
            String specialty = sc.nextLine();
            System.out.print("Курс: ");
            int course = sc.nextInt();
            sc.nextLine(); // очистка
            System.out.print("Группа: ");
            String group = sc.nextLine();
            System.out.print("Средний балл (GPA): ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            iDNumber[i] = new Student(firstName, lastName, specialty, course, group, gpa);
        }
    }

    public void quickSort(Comparator<Student> comp, int low, int high) {
        if (low < high) {
            int pi = partition(comp, low, high);
            quickSort(comp, low, pi - 1);
            quickSort(comp, pi + 1, high);
        }
    }

    private int partition(Comparator<Student> comp, int low, int high) {
        Student pivot = iDNumber[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comp.compare(iDNumber[j], pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = iDNumber[i];
        iDNumber[i] = iDNumber[j];
        iDNumber[j] = temp;
    }

    public void mergeSort(Comparator<Student> comp) {
        if (iDNumber.length <= 1) return;
        Student[] temp = new Student[iDNumber.length];
        mergeSortRecursive(comp, temp, 0, iDNumber.length - 1);
    }

    private void mergeSortRecursive(Comparator<Student> comp, Student[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSortRecursive(comp, temp, left, mid);
        mergeSortRecursive(comp, temp, mid + 1, right);
        merge(comp, temp, left, mid, right);
    }

    private void merge(Comparator<Student> comp, Student[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = iDNumber[i];
        }

        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (comp.compare(temp[i], temp[j]) <= 0) {
                iDNumber[k++] = temp[i++];
            } else {
                iDNumber[k++] = temp[j++];
            }
        }
        while (i <= mid) iDNumber[k++] = temp[i++];
        while (j <= right) iDNumber[k++] = temp[j++];
    }

    public void outArray() {
        if (iDNumber == null || iDNumber.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    public static Student[] mergeArrays(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 1, result, a.length, b.length); // ← ОШИБКА! Исправим ниже
        return result;
    }

    public static Student[] concatenate(Student[] a, Student[] b) {
        Student[] res = new Student[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        return res;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA app = new SortingStudentsByGPA();

        app.setArray();
        System.out.println("Исходный список");
        app.outArray();

        System.out.println("Быстрая сортировка по GPA");
        app.quickSort(new GpaComparator(), 0, app.iDNumber.length - 1);
        app.outArray();

        System.out.println("Сортировка слиянием по фамилии");
        app.mergeSort(new LastNameComparator());
        app.outArray();
    }
}