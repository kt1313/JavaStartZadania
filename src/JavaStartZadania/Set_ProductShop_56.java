package JavaStartZadania;

import pl.javastart.library.exception.NoSuchOptionException;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Set_ProductShop_56 {
    private static final int ADD_PRODUCT = 1;
    private static final int EXIT = 0;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    private static Scanner sc = new Scanner(System.in);
    Set<Set_Product_56> shop = new HashSet<>();

    public void mainMethod() {
        int option=-1;
        do {
            printOption();
            option = readOptions();
            executeOption(option);
        } while (option != EXIT);
    }

    private void printOption() {
        System.out.println("Wybierz opcje:");
        System.out.println("---> 1 - dodaj produkt.");
        System.out.println("---> 0 - koniec programu.");
    }

    private int readOptions() {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void executeOption(int option) {
        if (option == ADD_PRODUCT) {
            addNextProduct();
        } else if (option == EXIT) {
            printShop();
        } else {
            System.out.println("Nie ma takiej opcji.");
        }
    }

    private void printShop() {
        for (Set_Product_56 p : shop
        ) {
            System.out.println(p);
        }
    }

    private void addNextProduct() {
        Set_Product_56 product = createProduct();
        if (shop.contains(product)) {
            askToReplace(product);
        } else {
            addProduct(product);
        }
    }

    private Set_Product_56 createProduct() {
        System.out.println("Podaj nazwę: ");
        String name = sc.nextLine();
        System.out.println("Podaj cenę: ");
        Double price = sc.nextDouble();
        return new Set_Product_56(name, price);
    }
/*Tutaj ważne jest to, że jeżeli chcesz w zbiorze nadpisać już
 istniejący obiekt, to nie wystarczy wywołać metody add().
 Metoda add() w zbiorze działa tak, że jeżeli będziemy
 próbowali dodać duplikat, to zostanie on zignorowany i w
 zbiorze pozostanie oryginalny obiekt. Z tego powodu musimy
 najpierw usunąć poprzedni obiekt, a później dodać nowy
 jeszcze raz.*/
    private void askToReplace(Set_Product_56 product) {
        System.out.println("Produkt już istnieje. Czy chcesz go zastapić?");
        System.out.println("----> 0 Zignoruj produkt.");
        System.out.println("----> 1 Zastąp produkt.");
        int option = readOptions();
        sc.nextLine();
        if (option == REPLACE_PRODUCT) {
            shop.remove(product);
            addProduct(product);
        } else {
            System.out.println("Pozostawiono poprzedni produkt");
        }
    }

    private void addProduct(Set_Product_56 product) {
        shop.add(product);
        System.out.println("Produkt dodany do sklepu.");
    }

}

