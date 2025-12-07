public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex(3, 4);
        Complex c3 = factory.createComplex(-2, -5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
    }
}