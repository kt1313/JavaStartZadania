package JavaStartZadania;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zad12_Barmanv2 {


    public static Zad12_Drink createDrink() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę składników:");
        int ingrNr = sc.nextInt();
        sc.nextLine();
        Zad12_Ingredient[] ings = new Zad12_Ingredient[ingrNr];

        for (int i = 0; i < ingrNr; i++) {
            ings[i]=createIngred(i);
        }

        sc.close();
        Zad12_Drink drink = new Zad12_Drink(ings);
        return drink;
    }

    public static Zad12_Ingredient createIngred(int i) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj "+(i+1)+" składnik: ");
        String name=sc.nextLine();;
        System.out.println("Podaj ilość "+(i+1)+" składnika: ");
        int amount=sc.nextInt();

        return new Zad12_Ingredient(name, amount);
    }

    public static void printDrink(Zad12_Drink drink) {
        System.out.println("Składniki drinka: ");
        for (int i = 0; i < drink.ingredients.length; i++) {
            System.out.print(drink.ingredients[i].getName() + ", ");
            System.out.println(drink.ingredients[i].getAmount() + " ml.");
        }
    }
}
