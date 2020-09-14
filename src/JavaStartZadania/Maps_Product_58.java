package JavaStartZadania;

import java.util.Objects;

import java.util.Objects;

 class Maps_Product_58 implements Comparable<Maps_Product_58> {
    private String name;
    private double price;

    public Maps_Product_58(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }

    @Override
    public int compareTo(Maps_Product_58 p) {
        return Double.compare(this.price, p.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maps_Product_58 product = (Maps_Product_58) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}

