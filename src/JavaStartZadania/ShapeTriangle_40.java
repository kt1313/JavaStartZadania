package JavaStartZadania;

public class ShapeTriangle_40 implements Shape_40{
    private double aT;
    private double bT;
    private double cT;
    private double h;

    public ShapeTriangle_40(double aT, double bT, double cT, double h) {
        this.aT = aT;
        this.bT = bT;
        this.cT = cT;
        this.h = h;
    }

    public double getbT() {
        return bT;
    }

    public void setbT(double bT) {
        this.bT = bT;
    }

    public double getcT() {
        return cT;
    }

    public void setcT(double cT) {
        this.cT = cT;
    }

    public double getaT() {
        return aT;
    }

    public void setaT(double aT) {
        this.aT = aT;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    @Override
    public double calculateArea() {
        return aT * h * 0.5;
    }

    @Override
    public double calculatePerimeter() {
        return aT + bT + cT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt, ");
        sb.append("bok A: " + aT + ", ");
        sb.append("bok B: " + bT + ", ");
        sb.append("bok B: " + cT + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }

}
