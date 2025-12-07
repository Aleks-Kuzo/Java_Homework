public class VictorianChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на викторианском стуле"); }
    @Override public String getType() { return "Викторианский"; }
}
