import java.util.*;

public class MyList<T> implements Iterable<T> {
    private Object[] elements = new Object[10];
    private int size = 0;

    public void add(T item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[currentIndex++];
        }
    }
    public class Task2Test {
        public static void main(String[] args) {
            MyList<String> list = new MyList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            System.out.println("Итерация через for-each:");
            for (String fruit : list) {
                System.out.println("→ " + fruit);
            }

            System.out.println("\nПо индексу:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ": " + list.get(i));
            }
        }
    }
}