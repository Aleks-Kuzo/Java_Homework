public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements = new Object[DEFAULT_CAPACITY];
    private static int size = 0;
    private static int front = -1;
    private static int rear = -1;

    public static void enqueue(Object item) {
        if (size == elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object item = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return item;
    }

    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[front];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
        front = -1;
        rear = -1;
    }
}