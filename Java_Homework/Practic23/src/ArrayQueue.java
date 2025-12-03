public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
        size = 0;
        front = -1;
        rear = -1;
    }

    public void enqueue(Object item) {
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

    public Object dequeue() {
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

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
        front = -1;
        rear = -1;
    }
}