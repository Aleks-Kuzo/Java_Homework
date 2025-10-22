import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340"; // попробуй изменить

        // Регулярное выражение — просто точное совпадение
        String regex = "abcdefghijklmnopqrstuv18340";

        boolean matches = Pattern.matches(regex, input);

        if (matches) {
            System.out.println("Строка правильная");
        } else {
            System.out.println("Строка неправильная");
        }
    }
}