package JavaStartZadania;

import java.util.Scanner;

public class Zad18_Rectangle implements Zad18_Drawable{
    int a,b;
    @Override
    public void draw() {
        Scanner sc = new Scanner(System.in);
        //Zad18_ControlApp.userReq();
        System.out.println("Podaj długość boku a: ");
        a = sc.nextInt();
        System.out.println("Podaj długość boku b: ");
        b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
