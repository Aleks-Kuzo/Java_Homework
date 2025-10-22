public class Task4 {
    public static void main(String[] args) {
        String text = "(1+8) - 9/4";
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                if (i + 1 < text.length() && text.charAt(i + 1) == '+') {
                } else {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Есть цифры, после которых нет +");
        } else {
            System.out.println("Все цифры перед +");
        }
    }
}