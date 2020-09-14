package JavaStartZadania;

public class ShoppingCart_46 {
    public static final int MAX_PRODUCTS = 10;
    private int numberOfProducts = 0;
    private double totalCost = 0;
    ShoppingProduct_46[] cart = new ShoppingProduct_46[MAX_PRODUCTS];

    public void addProduct(ShoppingProduct_46 product) {
        cart[numberOfProducts] = product;
        numberOfProducts++;
    }

    public double totalCost(int products) {
        if (products == -1) {
           return  0;
        } else if (products < 2) {
            return cart[products].getProductPrice()+totalCost(products-1);
        } else
            return cart[products].getProductPrice() +
                    totalCost(products - 1);

    }


    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
