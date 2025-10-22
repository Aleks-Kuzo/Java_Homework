public class Task5 {
    public static String formatPhone(String phone) {
        String digitsOnly = phone.replaceAll("[^0-9+]", "");

        String countryCode;
        String number;

        if (digitsOnly.startsWith("+")) {
            String numPart = digitsOnly.substring(1);
            if (numPart.startsWith("1") && numPart.length() == 11) {
                countryCode = "1";
                number = numPart.substring(1);
            } else {
                if (numPart.length() == 11) {
                    countryCode = numPart.substring(0, 1);
                    number = numPart.substring(1);
                } else if (numPart.length() == 12) {
                    countryCode = numPart.substring(0, 2);
                    number = numPart.substring(2);
                } else {
                    countryCode = numPart.substring(0, 3);
                    number = numPart.substring(3);
                }
            }
        } else if (digitsOnly.startsWith("8") && digitsOnly.length() == 11) {
            countryCode = "7";
            number = digitsOnly.substring(1);
        } else {
            return "Неверный формат";
        }

        if (number.length() != 10) {
            return "Неверная длина номера";
        }

        return "+" + countryCode + " " +
                number.substring(0, 3) + "-" +
                number.substring(3, 6) + "-" +
                number.substring(6);
    }

    public static void main(String[] args) {
        System.out.println(formatPhone("+7123456789"));   // +7 917-565-5655
        System.out.println(formatPhone("+11234567890"));  // +1 042-896-5221
        System.out.println(formatPhone("7123456789"));    // +7 917-565-5655
        System.out.println(formatPhone("+375123456789"));  // +375 291-234-567
    }
}