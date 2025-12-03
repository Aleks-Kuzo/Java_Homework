public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] inputArray) {
        this.array = inputArray;
    }

    public T get(int index) {
        return array[index];
    }

    public void printArray() {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public int size() {
        return array.length;
    }
}

