import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Дата в формате ГГГГ-ММ-ДД: ");
        String input = sc.nextLine();

        Date userDate = sdf.parse(input);
        Date now = new Date();
        Date today = sdf.parse(sdf.format(now));

        if (userDate.after(today)) {
            System.out.println("Будущая дата");
        } else if (userDate.before(today)) {
            System.out.println("Прошлая дата");
        } else {
            System.out.println("Даты совпадают.");
        }
    }
}