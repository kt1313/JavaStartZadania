package JavaStartZadania;

import java.util.Scanner;

public class Zad18_Square implements Zad18_Drawable {
    int a;

    @Override
    public void draw() {
        Scanner sc = new Scanner(System.in);
        //Zad18_ControlApp.userReq();
        System.out.println("Podaj długość boku: ");
        sc.nextLine();
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
