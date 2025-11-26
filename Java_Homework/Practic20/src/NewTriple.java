import java.io.Serializable;

public class NewTriple<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public NewTriple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printTypes() {
        System.out.println("T: " + first.getClass().getSimpleName());
        System.out.println("V: " + second.getClass().getSimpleName());
        System.out.println("K: " + third.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "NewTriple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}