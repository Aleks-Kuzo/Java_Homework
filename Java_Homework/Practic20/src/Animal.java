import java.io.Serializable;

class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Животное: " + name;
    }
}