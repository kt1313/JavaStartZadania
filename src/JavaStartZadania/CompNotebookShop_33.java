package JavaStartZadania;

public class CompNotebookShop_33 {
    public static void main(String[] args) {
        CompDataStore_33 dataStore = new CompDataStore_33();

        dataStore.addComputer(new Computer_33("Dell", 334455));
        dataStore.addComputer(new Computer_33("Dell", 334455));
        dataStore.addComputer(new Computer_33("Lenovo", 435363));
        dataStore.addComputer(new Computer_33("Asus", 121234));
        dataStore.addComputer(new Computer_33("Asus", 4321));

        Computer_33 computerToFind = new Computer_33("Dell", 334455);
        int computersFound = dataStore.checkAvailability(computerToFind);
        System.out.println("Liczba komputerów " + computerToFind + ": " + computersFound);

        System.out.println("Wszystkie komputery dostępne w sklepie: ");
        for (Computer_33 c:dataStore.getComputers()) {
            System.out.println(c);
        }

    }
}
