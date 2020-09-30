package JavaStartZadania;

public class Zad19_Product {
    String name;
    int amount;

    public Zad19_Product(String name, int amount) {
        this.name=name;
        this.amount=amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStars(int amount){
        double round=Math.round(amount/10);
        for (int i=0;i<=round;i++){
            System.out.print('*');
        }

    }
    @Override
    public String toString() {
        return name  +", (" + amount +") ";
    }
}
