import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Год: ");
        int year = sc.nextInt();
        System.out.print("Месяц: ");
        int month = sc.nextInt();
        System.out.print("Число: ");
        int day = sc.nextInt();
        System.out.print("Часы: ");
        int hour = sc.nextInt();
        System.out.print("Минуты: ");
        int minute = sc.nextInt();

        Calendar cal = new GregorianCalendar(year, month - 1, day, hour, minute);
        java.util.Date date = cal.getTime();

        System.out.println("Созданная дата через Calendar: " + cal.getTime());
        System.out.println("Созданная дата через Date:     " + date);
    }
}