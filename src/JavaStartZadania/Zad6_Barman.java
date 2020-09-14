package JavaStartZadania;

public class Zad6_Barman {


    public static Zad6_Drink createDrink(String ingr1, int amount1, String ingr2, int amount2,
                                         String ingr3, int amount3) {

        Zad6_Ingredient ingredient1 = new Zad6_Ingredient(ingr1, amount1);
        Zad6_Ingredient ingredient2 = new Zad6_Ingredient(ingr2, amount2);
        Zad6_Ingredient ingredient3 = new Zad6_Ingredient(ingr3, amount3);

        Zad6_Drink drink = new Zad6_Drink(ingredient1, ingredient2, ingredient3);
        return drink;
    }

    public static String printDrink(Zad6_Drink drink) {
        double capacity = drink.getIngredient1().getAmount() + drink.getIngredient2().getAmount() +
                drink.getIngredient3().getAmount();
        return "Składniki drinka to " + drink.getIngredient1().getName() + ", " + drink.getIngredient2().getName() + ", " + drink.getIngredient3().getName()
                + " w proporcjach " + drink.getIngredient1().getAmount() / capacity + ", " +
                drink.getIngredient2().getAmount() / capacity +", " +
                drink.getIngredient3().getAmount() / capacity + ",a jego pojemność to " + capacity;
    }
}
