class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Triple<String, Integer, Double> box1 = new Triple<>("Привет", 42, 3.14);
        System.out.println(box1);
        box1.printTypes();

        System.out.println("\nЗадание 3:");
        NewTriple<String, Dog, Boolean> box2 =
                new NewTriple<>("Кошка", new Dog("Шарик"), true);
        System.out.println(box2);
        box2.printTypes();

        System.out.println("\nЗадание 4: MinMax");
        Integer[] numbers = {10, 3, 7, 15, 2};
        MinMax<Integer> mm = new MinMax<>(numbers);
        System.out.println("Минимум: " + mm.min());
        System.out.println("Максимум: " + mm.max());

        System.out.println("\nЗадание 4: Calculator");
        System.out.println("Сумма: " + Calculator.sum(5, 3.2));
        System.out.println("Разность: " + Calculator.subtract(10.0, 4));
        System.out.println("Произведение: " + Calculator.multiply(2.5, 4));
        System.out.println("Деление: " + Calculator.divide(10, 3));
    }
}