public interface Queue {
    void enqueue(Object item);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}