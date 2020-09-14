package JavaStartZadania;

import java.util.Scanner;

public class Pizzeria_35 {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze: ");

        for (Pizza_35 pizza : Pizza_35.values()) {
            System.out.println(pizza);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz pizzę: ");
        Pizza_35 pizza = Pizza_35.valueOf(sc.nextLine());

        System.out.println("Wybrano: " + pizza.name() + ". \nDziękujemy!");
        sc.close();
    }
}
