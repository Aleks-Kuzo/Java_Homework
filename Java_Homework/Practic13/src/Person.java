public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            sb.append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович");
        Person p2 = new Person("Иванов", "", "Иванов");
        Person p3 = new Person("Иванов", "Иванов", "");
        Person p4 = new Person("Иванов", "", "");

        System.out.println(p1.getShortName());
        System.out.println(p2.getShortName());
        System.out.println(p3.getShortName());
        System.out.println(p4.getShortName());
    }
}