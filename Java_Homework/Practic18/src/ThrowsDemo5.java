public class ThrowsDemo5 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Ключ: " + key);
    }

    public static void main(String[] args) {
        ThrowsDemo5 demo = new ThrowsDemo5();
        // demo.getDetails(null); - упадёт
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}