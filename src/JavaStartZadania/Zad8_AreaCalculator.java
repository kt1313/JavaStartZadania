package JavaStartZadania;

public class Zad8_AreaCalculator {

    public static double findSquareArea(Zad8_Square square) {
        double squareArea = 0;
        double firstSide = Math.abs(square.getPunktA().getX() - square.getPunktB().getX());
        double secondSide = Math.abs(square.getPunktA().getY() - square.getPunktB().getY());
        squareArea = 2 * firstSide + 2 * secondSide;
        return squareArea;
    }

    public static double findCircleArea(Zad8_Circle circle) {
        double circleArea = Math.PI * 2 * circle.getRadius();
        return circleArea;
    }

    public static boolean checkPointPos(Zad8_Circle circle, Zad8_Punkt punkt) {
        boolean inside = true;
        double distanceBetweenPointAndCentre=Math.sqrt(Math.abs(circle.getCentre().getX() - punkt.getX())+
                Math.abs(circle.getCentre().getY() - punkt.getY()));
        if (distanceBetweenPointAndCentre>=circle.getRadius()){
            inside=false;
        }
        return inside;
    }
}

