import java.util.Scanner;

public class Task4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Ошибка!");
        } finally {
            System.out.println("Программа завершена.");
        }
    }

    public static void main(String[] args) {
        Task4 ex = new Task4();
        ex.exceptionDemo();
    }
}