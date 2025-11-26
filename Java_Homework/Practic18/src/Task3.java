import java.util.Scanner;

public class Task3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) { // ловим всё!
            System.out.println("Что-то пошло не так");
        }
    }

    public static void main(String[] args) {
        Task3 ex = new Task3();
        ex.exceptionDemo();
    }
}