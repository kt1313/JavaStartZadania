package JavaStartZadania;

import java.util.Scanner;

public class Zad18_ControlApp {


    public static String userReq() {
         String  shape;
       // int  h, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz kształt: kwadrat/prostokąt/choinka");
        shape = sc.nextLine();
//        if (shape == "choinka") {
//            System.out.println("Podaj wysokość: ");
//            h = sc.nextInt();
//        } else if (shape == "kwadrat") {
//            System.out.println("Podaj długość boku: ");
//            a = sc.nextInt();
//        } else if (shape == "prostokąt") {
//            System.out.println("Podaj długość boku a: ");
//            a = sc.nextInt();
//            System.out.println("Podaj długość boku b: ");
//            b = sc.nextInt();
//        } else {
//            System.out.println("Wybierz właściwie.");
//            userReq();
//        }
        sc.close();
        return shape;
    }

}
