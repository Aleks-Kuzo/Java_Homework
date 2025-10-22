public class Main {
    public static void main(String[] args) {
        Stringble processor = new Stringble();
        String test = "Александр Кузнецов";
        System.out.println("Исходная строка: " + test);
        System.out.println("Количество символов: " + processor.count(test));
        System.out.println("Символы на нечётных позициях: " + processor.symbols(test));
        System.out.println("Инвертированная строка: " + processor.invert(test));
    }
}