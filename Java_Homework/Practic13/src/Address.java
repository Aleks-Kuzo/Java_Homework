import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // через split
    public void parseWithSplit(String input) {
        String[] parts = input.split(",");
        fillFields(parts);
    }

    // через StringTokenizer
    public void parseWithTokenizer(String input) {
        StringTokenizer st = new StringTokenizer(input, ",.;-");
        String[] parts = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            parts[i++] = st.nextToken().trim();
        }
        fillFields(parts);
    }

    private void fillFields(String[] parts) {
        country = (parts.length > 0) ? parts[0].trim() : "";
        region = (parts.length > 1) ? parts[1].trim() : "";
        city = (parts.length > 2) ? parts[2].trim() : "";
        street = (parts.length > 3) ? parts[3].trim() : "";
        house = (parts.length > 4) ? parts[4].trim() : "";
        building = (parts.length > 5) ? parts[5].trim() : "";
        apartment = (parts.length > 6) ? parts[6].trim() : "";
    }

    @Override
    public String toString() {
        return String.format(
                "Страна: %s\nРегион: %s\nГород: %s\nУлица: %s\nДом: %s\nКорпус: %s\nКвартира: %s",
                country, region, city, street, house, building, apartment
        );
    }

    public static void main(String[] args) {
        Address addr = new Address();
        String test1 = "Россия, Москва, Москва, Тверская, 1, 2, 10";
        String test2 = "США.Нью-Йорк;Манхэттен-5th Ave-100- -3B";

        System.out.println("Через split");
        addr.parseWithSplit(test1);
        System.out.println(addr);

        System.out.println("Через StringTokenizer");
        addr.parseWithTokenizer(test2);
        System.out.println(addr);
    }
}