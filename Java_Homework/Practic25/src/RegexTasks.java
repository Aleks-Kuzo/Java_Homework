import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class RegexTasks {
    public static boolean task1(String input) {
        return input.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void task2(String text) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s+(USD|RUB|EUR)");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println("→ " + matcher.group());
        }
    }

    public static boolean task3(String text) {
        return Pattern.compile("\\d(?![+])").matcher(text).find();
    }

    public static boolean task4(String input) {
        if (!input.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }
        try {
            LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            int year = date.getYear();
            return year >= 1900 && year <= 9999;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean task5(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    public static boolean task6(String password) {
        if (password.length() < 8) return false;
        if (!password.matches("^[a-zA-Z0-9_]+$")) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[a-z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(task1("abcdefghijklmnopqrstuv18340"));

        System.out.println("\nЗадача 2");
        task2("Цены: 25.98 USD, 100 RUB, 0.5 EUR, 44 ERR, 0.004 EU, 123.45 USD.");

        System.out.println("\nЗадача 3");
        System.out.println(task3("(1+ 8) – 9/ 4"));
        System.out.println(task3("1+"));

        System.out.println("\nЗадача 4");
        System.out.println(task4("29/02/2000"));
        System.out.println(task4("29/02/2001"));

        System.out.println("\nЗадача 5");
        System.out.println(task5("user@example.com"));
        System.out.println(task5("root@localhost"));
        System.out.println(task5("@my.ru"));

        System.out.println("\nЗадача 6");
        System.out.println(task6("F032_Password"));
        System.out.println(task6("smart_pass"));
    }
}

