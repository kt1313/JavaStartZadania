package JavaStartZadania;

public class Zad6_BarmanTest {
    public static void main(String[] args) {
        Zad6_Drink drink = Zad6_Barman.createDrink("Sok ananasowy", 100, "Likier Malibu",
                50, "Mleko kokosowe", 100);
        System.out.println(Zad6_Barman.printDrink(drink));

    }
}
