package JavaStartZadania;

public class Zad8_TestClass {

    public static void main(String[] args) {

        Zad8_Punkt punkt=new Zad8_Punkt(-3, 4);
        Zad8_Punkt centre=new Zad8_Punkt(-2,5);
        Zad8_Circle circle=new Zad8_Circle(centre,5);
        Zad8_Punkt punktA=new Zad8_Punkt(-4,2);
        Zad8_Punkt punktB=new Zad8_Punkt(10,2);
        Zad8_Punkt punktC=new Zad8_Punkt(10,-5);
        Zad8_Punkt punktD=new Zad8_Punkt(-4,-5);
        Zad8_Square square=new Zad8_Square(punktA,punktB,punktC,punktD);

        System.out.println("Podany punkt leży wewnątrz okręgu: "+Zad8_AreaCalculator.checkPointPos(circle,punkt));
        System.out.println("Pole kwadratu wynosi: "+ Zad8_AreaCalculator.findSquareArea(square));
        System.out.printf("Pole koła wynosi: %.2f",Zad8_AreaCalculator.findCircleArea(circle));
    }
}
