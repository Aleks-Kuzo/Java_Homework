package mypackage;

public class Author {
    private String email;
    private String name;
    private char gender;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Author(String email, String name, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public Author() {}

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';

    }
}
