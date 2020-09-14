package JavaStartZadania;

public class OrderItem_36 {

    private String name;
    private double price;
    private int sameNumber = 0;
    private OrderStatus_36 status;



    public OrderItem_36(String name, double price, OrderStatus_36 status) {
        this.name = name;
        this.price = price;
        this.status = status;
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

    public OrderStatus_36 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus_36 status) {
        this.status = status;
    }
@Override
public String toString(){
        return name + "(" + price + "zł - " + status;
}

}


