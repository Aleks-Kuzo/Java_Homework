import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String date = "29/02/2000";
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([1-9]\\d{3})";

        if (Pattern.matches(regex, date)) {
            String yearStr = date.substring(6);
            int year = Integer.parseInt(yearStr);
            if (year >= 1900 && year <= 9999) {
                System.out.println("Формат даты правильный");
            } else {
                System.out.println("Год вне диапазона 1900–9999");
            }
        } else {
            System.out.println("Неверный формат даты");
        }
    }
}