package JavaStartZadania;

import java.awt.*;

 class ShapeCircle_40  implements Shape_40 {
    private double r;

    public ShapeCircle_40(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Shape_40.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape_40.PI * r;
    }

}
