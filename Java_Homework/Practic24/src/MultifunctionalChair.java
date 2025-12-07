public class MultifunctionalChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на многофункциональном стуле (он ещё массаж делает!)"); }
    @Override public String getType() { return "Многофункциональный"; }
}