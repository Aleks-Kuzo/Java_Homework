import java.util.Scanner;

public class Task12 {
    public static void odd() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            return;
        }
        else if (num % 2 == 1) {
            System.out.println(num);
        }
        odd();
    }

    public static void main(String[] args) {
        odd();
    }
}