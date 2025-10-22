public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println("2^10 = " + mc.pow(2, 10));
        System.out.println("|3 + 10i| = " + mc.complexAbs(3, 10));
        MathFunc mf = (MathFunc) mc;
        System.out.println("2piR = " + mf.circleLength(14));
    }
}