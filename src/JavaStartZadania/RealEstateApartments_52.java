package JavaStartZadania;

public class RealEstateApartments_52 implements Comparable<RealEstateApartments_52> {
    private String city;
    private int price;
    private int square;
    private double pricePerMeter;

    public RealEstateApartments_52(String city, int price, int square, double pricePerMeter) {
        this.city = city;
        this.price = price;
        this.square = square;
        this.pricePerMeter = pricePerMeter;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(double pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Mieszkanie w miescie: " + city + ", cena= " + price +
                ", metraż= " + square + ", cena za metr: " + pricePerMeter;
    }


    @Override
    public int compareTo(RealEstateApartments_52 o) {
        if (pricePerMeter > o.pricePerMeter)
            return 1;
        else if (pricePerMeter < o.pricePerMeter)
            return -1;
        else
            return 0;
    }
    /*
    * @Override
public int compareTo(Product p) {
    if (price > p.price)
        return 1;
    else if (price < p.price)
        return -1;
    int producerCompare = producer.compareTo(p.producer);
    if (producerCompare != 0)
        return producerCompare;
    return name.compareTo(p.name);
}
    * */
}
