package JavaStartZadania;

public class ShapeRectangle_40 implements Shape_40 {
    private double a;
    private double b;

    public ShapeRectangle_40(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        String sb = "Pole prostokąta wynosi: " + calculateArea() + ", a obwód: " + calculatePerimeter() + ".";
        return sb.toString();
    }
}
