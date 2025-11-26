import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Введите ключ (не пустой!): ");
                String key = myScanner.next();
                printDetails(key);
                success = true; // если дошли сюда — всё норм
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage()); // цикл продолжится
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Ключ не может быть пустым!");
        }
        return "Данные для: " + key;
    }

    public static void main(String[] args) {
        Task8 app = new Task8();
        app.getKey();
    }
}