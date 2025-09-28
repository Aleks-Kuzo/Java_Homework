public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        // Обновляем поля родителя
        super.width = side;
        super.length = side;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side + ", " + super.toString();
    }
}