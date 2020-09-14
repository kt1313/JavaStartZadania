package JavaStartZadania;

public class Zad8_Circle {
    Zad8_Punkt centre;
    int radius;

    public Zad8_Circle(Zad8_Punkt centre, int radius){
        this.centre=centre;
        this.radius=radius;
    }

    public Zad8_Punkt getCentre() {
        return centre;
    }

    public void setCentre(Zad8_Punkt centre) {
        this.centre = centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
