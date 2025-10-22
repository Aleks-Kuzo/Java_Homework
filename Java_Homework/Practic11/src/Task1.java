import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов"; // ← замени на свою фамилию

        Date received = new Date();
        Date submitted = new Date();

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + received);
        System.out.println("Дата сдачи задания: " + submitted);
    }
}