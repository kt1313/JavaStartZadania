package JavaStartZadania;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Zmienne_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x, y;
        x = random.nextInt(100);
        y = random.nextInt(100);
        System.out.println("X= " + x + " "+  "Y= " + y);
        System.out.println("X > Y? " + (x > y));
        System.out.println("X razy 2 > Y? " + ((x*2) > y));
        System.out.println("Y < X+3 i jednoczesnie > X-2? " + ((y<(x+3)) && (y>(x-2))));
        System.out.println("X razy Y jest parzysty? " + (((x*y)%2)==0));


        boolean instance = "z" instanceof String;
        System.out.println(instance);
    }
}
