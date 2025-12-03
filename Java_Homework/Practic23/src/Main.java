import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        try {
            int x = Integer.parseInt(scanner.nextLine().trim());
            Expression expr = new Add(
                    new Subtract(
                            new Multiply(new Variable(), new Variable()),
                            new Multiply(new Const(2), new Variable())
                    ),
                    new Const(1)
            );
            System.out.println(expr.evaluate(x));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
}