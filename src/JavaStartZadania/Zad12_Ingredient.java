package JavaStartZadania;

public class Zad12_Ingredient {
    private String name;
    private int amount;

    public Zad12_Ingredient(String name, int amount) {
        this.name=name;
        this.amount=amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
