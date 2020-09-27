package JavaStartZadania;

import java.util.Scanner;

public class Zad18_TestDraw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shape;

        System.out.println("Wybierz kształt: kwadrat/prostokąt/choinka");
        shape = sc.nextLine();
        switch (shape) {
            case "kwadrat":
                Zad18_Drawable shape1 = new Zad18_Square();
                shape1.draw();
                break;
            case "prostokąt":
                Zad18_Drawable shape2 = new Zad18_Rectangle();
                shape2.draw();
                break;
            case "choinka":
                Zad18_Drawable shape3 = new Zad18_Tree();
                shape3.draw();
                break;
            default:
                System.out.println("Wybierz właściwie.");
        }
    }
}
