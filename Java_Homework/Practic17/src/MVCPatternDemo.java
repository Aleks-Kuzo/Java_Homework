public class MVCPatternDemo {

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Кузнецов Александр");
        System.out.println("После изменения:");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Гуров Павел");
        student.setRollNumber("1234567890");
        student.setCourse(2);
        return student;
    }
}