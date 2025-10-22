import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 1500.50 RUB, 30.00 EUR, но 44 ERR и 0.004 EU — не подходят.";

        String regex = "\\d+(\\.\\d+)?\\s+(USD|RUB|EUR)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}