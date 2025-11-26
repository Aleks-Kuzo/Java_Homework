public class Triple<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public V getSecond() { return second; }
    public K getThird() { return third; }

    public void printTypes() {
        System.out.println("Тип first: " + first.getClass().getSimpleName());
        System.out.println("Тип second: " + second.getClass().getSimpleName());
        System.out.println("Тип third: " + third.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}