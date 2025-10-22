import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    String name;
    Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getBirthDate(String format) {
        SimpleDateFormat sdf;
        if (format.equals("short")) {
            sdf = new SimpleDateFormat("dd.MM.yy");
        } else if (format.equals("medium")) {
            sdf = new SimpleDateFormat("dd MMM yyyy");
        } else if (format.equals("full")) {
            sdf = new SimpleDateFormat("EEEE, d MMMM yyyy");
        } else {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        }
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return name + ", дата рождения: " + getBirthDate("medium");
    }
}

class Task3 {
    public static void main(String[] args) {
        Date d = new Date(2006-1900, 4, 31);

        Student s = new Student("Александр", d);
        System.out.println(s);
        System.out.println("Коротко: " + s.getBirthDate("short"));
        System.out.println("Полностью:   " + s.getBirthDate("full"));
    }
}