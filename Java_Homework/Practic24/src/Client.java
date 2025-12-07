public class Client {
    public void sit(Chair chair) {
        System.out.println("Клиент садится на " + chair.getType() + " стул:");
        chair.sit();
        System.out.println("---");
    }
}