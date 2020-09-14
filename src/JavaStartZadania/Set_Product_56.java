package JavaStartZadania;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Set_Product_56 {

    private static String name;
    private static Double price;

    public Set_Product_56(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private static void compareProduct() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set_Product_56 that = (Set_Product_56) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
