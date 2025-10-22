public class Task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("Заканчивается на '!!!': " + str.endsWith("!!!"));
        System.out.println("Начинается на 'I like': " + str.startsWith("I like"));
        System.out.println("Содержит 'Java': " + str.contains("Java"));
        System.out.println("Позиция 'Java': " + str.indexOf("Java"));
        String replaced = str.replace('a', 'o');
        System.out.println("После замены 'a' → 'o': " + replaced);
        System.out.println("Верхний регистр: " + str.toUpperCase());
        System.out.println("Нижний регистр: " + str.toLowerCase());
        String javaPart = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println("Вырезано: " + javaPart);
    }
}