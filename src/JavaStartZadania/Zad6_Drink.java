package JavaStartZadania;

public class Zad6_Drink {
    Zad6_Ingredient ingredient1;
    Zad6_Ingredient ingredient2;
    Zad6_Ingredient ingredient3;

    public Zad6_Drink(Zad6_Ingredient ingredient1,
                      Zad6_Ingredient ingredient2,
                      Zad6_Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public Zad6_Ingredient getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(Zad6_Ingredient ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public Zad6_Ingredient getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(Zad6_Ingredient ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public Zad6_Ingredient getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(Zad6_Ingredient ingredient3) {
        this.ingredient3 = ingredient3;
    }
}
