public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3.8),
                new Student(4.0),
                new Student(3.2),
                new Student(4.5),
                new Student(3.9)
        };

        System.out.println("Исходный список:");
        for (Student s : students) {
            System.out.println(s);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Отсортированный список:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}