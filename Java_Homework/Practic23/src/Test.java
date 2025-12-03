public class Test {
    public static void main(String[] args) {
        Queue q = new LinkedQueue();
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("size: " + q.size());
        q.enqueue("первый");
        q.enqueue("второй");
        q.enqueue("третий");
        System.out.println("size: " + q.size());
        System.out.println("element: " + q.element());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("element: " + q.element());
        System.out.println("isEmpty: " + q.isEmpty());

        q.clear();
        System.out.println("isEmpty после clear: " + q.isEmpty());
        System.out.println("size после clear: " + q.size());
    }
}