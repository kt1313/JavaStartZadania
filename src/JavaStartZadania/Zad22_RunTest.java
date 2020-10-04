package JavaStartZadania;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zad22_RunTest {
    public static void main(String[] args) {
        //utwórz Menu
        TreeMap<Integer, Zad22_Meal> meals=Zad22_OrderCalculator.mealsCreator();
        //wydrukuj Menu i pobierz wybor Klienta
        Zad22_OrderCalculator.userChoice(meals);
        //oblicz cenę
        //wydrukuj Zamowienie i cenę
         }

}

