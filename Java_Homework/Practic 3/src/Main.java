import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double CourseEuro = 0.84;
        double CourseRub = 83.35;
        double CourseChy = 7.12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму в долларах");
        double dollars = scanner.nextDouble();

        double euro = dollars * CourseEuro;
        double rub = dollars * CourseRub;
        double chy = dollars * CourseChy;

        System.out.println(dollars + "долларов = " + euro + " евро");
        System.out.println(dollars + "долларов = " + rub + " рублей");
        System.out.println(dollars + "долларов = " + chy + " юаней");

        scanner.close();
    }
}