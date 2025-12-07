public class MagicChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на магическом стуле... вы слышите шёпот?"); }
    @Override public String getType() { return "Магический"; }
}