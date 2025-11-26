public class Task1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0); // выведет Infinity
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Task1 ex = new Task1();
        ex.exceptionDemo(); // не упадёт, выведет сообщение (в предыдущем случае программа бы упала с ArithmeticException
    }
}