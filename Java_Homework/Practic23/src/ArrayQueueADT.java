public class ArrayQueueADT {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueueADT() {
        this(10);
    }

    public ArrayQueueADT(int capacity) {
        elements = new Object[capacity];
        size = 0;
        front = -1;
        rear = -1;
    }

    public static void enqueue(ArrayQueueADT queue, Object item) {
        if (queue.size == queue.elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        if (queue.size == 0) {
            queue.front = 0;
        }
        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.elements[queue.rear] = item;
        queue.size++;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object item = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        if (queue.size == 0) {
            queue.front = -1;
            queue.rear = -1;
        }
        return item;
    }

    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.elements[queue.front];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.elements.length; i++) {
            queue.elements[i] = null;
        }
        queue.size = 0;
        queue.front = -1;
        queue.rear = -1;
    }
}