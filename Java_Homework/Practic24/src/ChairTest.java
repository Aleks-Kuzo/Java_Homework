public class ChairTest {
    public static void main(String[] args) {
        Client client = new Client();

        Chair chair1 = new VictorianChairFactory().createChair();
        Chair chair2 = new MultifunctionalChairFactory().createChair();
        Chair chair3 = new MagicChairFactory().createChair();

        client.sit(chair1);
        client.sit(chair2);
        client.sit(chair3);
    }
}