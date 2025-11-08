public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNumber, int studentCourse) {
        System.out.println("Студент:");
        System.out.println("Имя: " + studentName);
        System.out.println("Номер зачётки: " + studentRollNumber);
        System.out.println("Курс: " + studentCourse);
        System.out.println(); // пустая строка для красоты
    }
}