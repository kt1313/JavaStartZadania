package JavaStartZadania;

import java.util.*;

public class Zad22_OrderCalculator {
    private static ArrayList<Integer> arrayOrder = new ArrayList<>();

    public static TreeMap<Integer, Zad22_Meal> mealsCreator() {
        TreeMap<Integer, Zad22_Meal> meals = new TreeMap();

        meals.put(1, new Zad22_Meal(1, "Zupa pomidorowa", 15.50));
        meals.put(2, new Zad22_Meal(2, "Zupa szczawiowa", 15.50));
        meals.put(3, new Zad22_Meal(3, "Zupa dnia", 12.50));
        meals.put(4, new Zad22_Meal(4, "Zupa owocowa", 13.50));
        meals.put(5, new Zad22_Meal(5, "Losoś ze szpinakiem", 29.00));
        meals.put(6, new Zad22_Meal(6, "Dorsz smażony", 27.50));
        meals.put(7, new Zad22_Meal(7, "Pstrąg pieczony", 28.90));
        meals.put(8, new Zad22_Meal(8, "Schabowy z kapustą", 25.50));
        meals.put(9, new Zad22_Meal(9, "Klopsiki w sosie pomidorowym z ziemniakami", 23.20));
        meals.put(10, new Zad22_Meal(10, "Pierogi z jagodami", 22.50));
        meals.put(11, new Zad22_Meal(11, "Zestaw surówek", 22.50));
        meals.put(12, new Zad22_Meal(12, "Kompot", 5));
        meals.put(13, new Zad22_Meal(13, "Woda gazowana", 3.5));
        meals.put(14, new Zad22_Meal(14, "Piwo zimne", 6.5));
        return meals;
    }

    public static void userChoice(TreeMap<Integer, Zad22_Meal> meals) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Wybierz z naszego Menu. Wystarczy, że wpiszesz numery posiłków po przecinku.");
        printMenu(meals);

        //otrzymujemy od uzytkownika linie z nr dań po przecinkach
        String choiceStringLine = sc.nextLine();

        //dzielimy na pojedyncze wybory i wpisujemy do tablicy Integerow arrayClientChoice
        createOrder(choiceStringLine);
        //obliczamy cene i drukujemy wraz z zamowionymi posiłkami
        System.out.println("Zamówiliście:");
        printOrder(arrayOrder, meals);
        System.out.printf("Całkowita kwota z napiwkiem to: %.2f złociszy.", calculateOrder(arrayOrder, meals));
        sc.close();
    }

    private static void printMenu(TreeMap<Integer, Zad22_Meal> meals) {
        //Set<Integer> mealsNamesList = meals.keySet();
        int i = 1;
        for (Zad22_Meal m : meals.values()) {
            System.out.println("Posiłek nr: " + i + ", " + m);
            i++;
        }
    }

    private static void printOrder(ArrayList<Integer> arrayOrder, Map<Integer, Zad22_Meal> meals) {
        for (Integer i : arrayOrder) {
            System.out.println(meals.get(i).getMealName());
        }
    }

    private static ArrayList<Integer> createOrder(String choiceStringLine) {
        String[] splittedLine = choiceStringLine.split(",");
        for (String s : splittedLine) {
            arrayOrder.add(Integer.parseInt(s));
        }
        return arrayOrder;
    }

    private static double calculateOrder(ArrayList<Integer> arrayOrder, Map<Integer, Zad22_Meal> meals) {
        double priceForMeals = 0;
        double priceForOrder = 0;
        for (Integer i : arrayOrder
        ) {
            //sumujemy cenę posiłkow
            double orderedMealPrice = meals.get(i).getMealPrice();
            priceForMeals += orderedMealPrice;
            //dodajemy napiwek
            if (priceForMeals >= 100) {
                priceForOrder = priceForMeals + priceForMeals * 0.15;
            } else {
                priceForOrder = priceForMeals + priceForMeals * 0.1;
            }
        }
        return priceForOrder;
    }

}
