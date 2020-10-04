package JavaStartZadania;

import java.util.Objects;

public class Zad22_Meal implements Comparable<Zad22_Meal>{
    int mealNr;
    String mealName;
    double mealPrice;

    public Zad22_Meal(int mealNr,String mealName, double mealPrice) {
        this.mealNr=mealNr;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
    }

    public int getMealNr() {
        return mealNr;
    }

    public void setMealNr(int mealNr) {
        this.mealNr = mealNr;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zad22_Meal that = (Zad22_Meal) o;
        return mealNr == that.mealNr &&
                Double.compare(that.mealPrice, mealPrice) == 0 &&
                Objects.equals(mealName, that.mealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mealNr, mealName, mealPrice);
    }

    @Override
    public String toString() {
        return " " + mealName + ", Cena=" + mealPrice ;
    }

    @Override
    public int compareTo(Zad22_Meal o) {
        if (o.mealNr>getMealNr())return 1;
        else if(o.mealNr<getMealNr())return -1;
        else
        return 0;
    }
}
