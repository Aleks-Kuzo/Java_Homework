import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();
        demo.getKey();
    }
}