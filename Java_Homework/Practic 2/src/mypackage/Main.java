package mypackage;


public class Main {
    public static void main(String[] args) {

    Ball TestBall = new Ball(5,5);
    System.out.println(TestBall.toString());

    TestBall.Move(5,5);
    System.out.println(TestBall.toString());
    }


    Point p1 = new Point(5.0, 10.0);
    Point p2 = new Point(10.0, 15.0);

    Circle c1 = new Circle(p1, 2);
    Circle c2 = new CIrcle(p2, 6);

    Tester tester = new Tester(5);

    tester.addCircle(c1);
    tester.addCircle(c2);

}
