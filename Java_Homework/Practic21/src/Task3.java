public class Task3 {
    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return array[index];
    }

    public static void main(String[] args) {
        Double[] doubles = {1.1, 2.2, 3.3};
        System.out.println("Элемент по индексу 1: " + getElement(doubles, 1));

        Character[] chars = {'A', 'B', 'C'};
        System.out.println("Элемент по индексу 0: " + getElement(chars, 0));
    }
}