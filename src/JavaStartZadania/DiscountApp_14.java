package JavaStartZadania;

class DiscountApp_14 {
    public static void main(String[] args) {
        Client_14 client1 = new Client_14(null, "Kowalski", true);
        double price1 = 1100;

        Client_14 client2 = new Client_14("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService_14 discountService = new DiscountService_14();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintPrice_14 printService = new PrintPrice_14();
        printService.printSummary(client1, price1, priceDiscount1);
        printService.printSummary(client2, price2, priceDiscount2);
    }
}