public class Main {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Исходная точка: " + point);

        point.moveRight();
        point.moveUp();
        System.out.println("После moveRight() и moveUp(): " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("\nИсходный круг: " + circle);

        circle.moveDown();
        circle.moveLeft();
        System.out.println("После moveDown() и moveLeft(): " + circle);
    }
}