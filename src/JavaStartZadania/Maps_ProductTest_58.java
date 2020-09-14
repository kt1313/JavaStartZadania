package JavaStartZadania;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Maps_ProductTest_58 {

        public static void main(String[] args) {
            try {
                Map<String, TreeSet<Maps_Product_58>> productsMap = Maps_Shop_58.readFile("products.csv");
                String category = readCategoryFromUser();
                printCategoryStats(productsMap, category);
            } catch (FileNotFoundException e) {
                System.err.println("Brak pliku z danymi produktów");
            }
        }

        private static String readCategoryFromUser() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę kategorii dla wyświetlenia statystyk:");
            return scanner.nextLine();
        }

        private static void printCategoryStats(Map<String, TreeSet<Maps_Product_58>> productsMap, String category) {
            TreeSet<Maps_Product_58> products = productsMap.get(category);
            if (products == null)
                System.out.println("Brak produktów w danej kategorii");
            else  {
                printAll(products);
                printAvgPrice(products);
                printCheapestAndExpensiveProduct(products);
            }
        }

        private static void printAll(TreeSet<Maps_Product_58> products) {
            for (Maps_Product_58 product : products) {
                System.out.println(product);
            }
        }

        private static void printAvgPrice(TreeSet<Maps_Product_58> products) {
            double sumPrice = 0;
            for (Maps_Product_58 product : products) {
                sumPrice += product.getPrice();
            }
            double avgPrice = sumPrice / products.size();
            System.out.println("Średnia cena produktów: " + avgPrice);
        }

        private static void printCheapestAndExpensiveProduct(TreeSet<Maps_Product_58> products) {
            System.out.println("Najtańszy produkt: " + products.first());
            System.out.println("Najdroższy produkt: " + products.last());
        }
    }
