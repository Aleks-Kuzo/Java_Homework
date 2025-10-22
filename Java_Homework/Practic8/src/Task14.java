import java.util.Scanner;

public class Task14 {
    public static void ans(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            ans(n / 10);
            System.out.println(n % 10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ans(N);
    }
}