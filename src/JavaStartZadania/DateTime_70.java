package JavaStartZadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DateTime_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aby rozpocząć pomiar naciśnij ENTER.");
        sc.nextLine();
        Instant i1 = Instant.now();
        System.out.println("Aby zakończyć pomiar naciśnij ENTER.");
        sc.nextLine();
        Instant i2 = Instant.now();
        Duration timeElapsed = Duration.between(i1,i2);
        System.out.println("Czas jak upłynął między pomiarami: " + timeElapsed.getSeconds());
    }
}
