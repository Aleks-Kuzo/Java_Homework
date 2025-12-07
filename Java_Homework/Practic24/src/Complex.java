public class Complex {
    private double real;
    private double image;

    public Complex() {
        this(0.0, 0.0);
    }
    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    public double getReal() {
        return real;
    }
    public double getImage() {
        return image;
    }
    @Override
    public String toString() {
        if (image >= 0) {
            return real + " + " + image + "i";
        } else {
            return real + " - " + (-image) + "i";
        }
    }
}