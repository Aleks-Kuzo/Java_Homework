public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        this.array = array;
    }

    public T min() {
        T smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(smallest) < 0) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public T max() {
        T largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(largest) > 0) {
                largest = array[i];
            }
        }
        return largest;
    }
}