package JavaStartZadania;

import java.awt.*;
import java.util.Scanner;

public class PointApplication_11 {
    public static void main(String[] args) {

        Point_11 p =new Point_11(10,20);
        PointController_11 pc = new PointController_11();

        System.out.println("Punkt: (" + p.getX()+";"+p.getY()+")");

        System.out.println("Podaj swój wybór: ");
        System.out.println("0 - punkt przesunięty w prawo. ");
        System.out.println("1 - punkt przesunięty w lewo.");
        System.out.println("2 - punkt przesunięty w dół.");
        System.out.println("3 - punkt przesunięty w górę.");

        Scanner read = new Scanner(System.in);
        int choose = read.nextInt();
        switch (choose){
            case 0:
                pc.addX(p);
                break;
            case 1:
                pc.minusX(p);
                break;
            case 2:
                pc.minusY(p);
                break;
            case 3:
                pc.addY(p);
                break;
            default:
                System.out.println("Podaj właściwy wybór!");

        }
        System.out.println("Punkt przesunięty: (" + p.getX()+";"+p.getY()+")");

    }
}
