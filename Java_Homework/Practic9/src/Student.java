public class Student {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Итоговый балл: " + gpa;
    }
}