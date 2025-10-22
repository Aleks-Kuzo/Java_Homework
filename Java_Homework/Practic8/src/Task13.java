import java.util.Scanner;

public class Task13 {
    public static void odd() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            return;
        }

        System.out.println(num);
        even();
    }

    public static void even() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            return;
        }
        odd();
    }

    public static void main(String[] args) {
        odd();
    }
}