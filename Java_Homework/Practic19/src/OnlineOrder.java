import java.util.Scanner;

public class OnlineOrder {
    public static boolean isValidINN(String inn) {
        if (inn == null) return false;
        if (inn.length() != 10 && inn.length() != 12) return false;
        for (int i = 0; i < inn.length(); i++) {
            if (!Character.isDigit(inn.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fio = sc.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = sc.nextLine();

        try {
            if (!isValidINN(inn)) {
                throw new InvalidINNException("ИНН недействителен: " + inn);
            }
            System.out.println("Заказ оформлен для: " + fio);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}