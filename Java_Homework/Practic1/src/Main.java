import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        final int NUMBER = 100;
        final double PI = 3.14;
        System.out.println("PI = " + PI);
        System.out.println("NUMBER = " + NUMBER);

        String s = "HI";
        String ss = new String("qwerty");
        ss = "ytrewq";
        System.out.printf(ss + s);

        String message;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your message");
        message = scan.nextLine();
        System.out.println("You entered: \"" + message + "\"");

    }
}
