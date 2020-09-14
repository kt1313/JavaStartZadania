package JavaStartZadania;

public class Auction_7 {
    public static void main(String[] args) {
        Address_7 address1 = new Address_7();
        address1.city = "Wrocław";
        address1.postalCode = "50-500";
        address1.flatNo = 21;
        address1.homeNo = "24A";
        address1.street = "Kościuszki";

        Address_7 address2 = null;

        Person_7 person1 = new Person_7();
        person1.address = address1;
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";

        Person_7 person2 = new Person_7();
        person2.lastName = "Adamczyk";
        person2.firstName = "Justyna";

        AuctionObject_7 object1 = new AuctionObject_7();
        object1.title = "Xbox One";
        object1.description = "Konsola dla wymagających graczy. ";
        object1.price = 999.90;
        object1.seller = person1;

        AuctionObject_7 object2 = new AuctionObject_7();
        object2.title = "Samsung S20";
        object2.description = "Niesamowity telefon z trzema obiektywami";
        object2.price = 3999;
        object2.seller = person2;

        String daneAukcji1 = (object1.title + ", " + object1.description + ", " + object1.price + ", " + object1.seller.firstName + "  " + object1.seller.lastName);
        String daneAukcji2 = (object2.title + ", " + object2.description + ", " + object2.price + ", " + object2.seller.firstName + "  " + object2.seller.lastName);

        System.out.println("Aukcja 1:" + daneAukcji1);
        System.out.println("Aukcja 2:" + daneAukcji2);



    }
}
