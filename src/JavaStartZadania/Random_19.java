package JavaStartZadania;

import java.util.Random;
import java.util.Scanner;

public class Random_19 {
    public static void main(String[] args) {
        int clientChoice;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wybór: ");
        System.out.println("0 - orzeł");
        System.out.println("1 - reszka");
        clientChoice = scanner.nextInt();

        int a = random.nextInt(2);
        if(clientChoice == a){
            System.out.println("Wylosowano: " + a + " Greeejt! Trafiłeś!");
        }else System.out.println("Wylosowano: " + a + " ....." +
                "Uuups, następną razą się uda.;)");

    }
}
