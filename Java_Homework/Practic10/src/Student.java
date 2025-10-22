public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(String firstName, String lastName, String specialty, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return specialty; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return String.format(" | Спец: | Курс: | Группа: | GPA: ",
                firstName, lastName, specialty, course, group, gpa);
    }
}