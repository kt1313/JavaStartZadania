package JavaStartZadania;

public class ShoppingApp_46 {
    public static void main(String[] args) {
        ShoppingCart_46 cart = new ShoppingCart_46();
        cart.addProduct(new ShoppingProduct_46("żelazko", 234.99));
        cart.addProduct(new ShoppingProduct_46("proszek", 38.99));
        cart.addProduct(new ShoppingProduct_46("mega gacie", 76.65));
        cart.addProduct(new ShoppingProduct_46("stary but", 10.65));


        double totalCart = cart.totalCost(cart.getNumberOfProducts() - 1);
        System.out.printf("Całkowite zakupy to %.2f.%nGratulacje!", totalCart);

    }
}