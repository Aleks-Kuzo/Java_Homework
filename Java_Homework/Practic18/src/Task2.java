import java.util.Scanner;

public class Task2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Hе целое число");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    public static void main(String[] args) {
        Task2 ex = new Task2();
        ex.exceptionDemo();
    }
}