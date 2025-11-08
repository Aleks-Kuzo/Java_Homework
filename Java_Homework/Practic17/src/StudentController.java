public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentRollNumber(String rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public void setStudentCourse(int course) {
        model.setCourse(course);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNumber(), model.getCourse());
    }
}