package JavaStartZadania;

public class CompDataStore_33 {
    private int numberOfPieces;
    private int actualComputer = 0;
    private final static int MAX_COMPUTERS = 100;
    private Computer_33[] computers = new Computer_33[MAX_COMPUTERS];

    public Computer_33[] getComputers() {
        Computer_33[] comps = new Computer_33[actualComputer];
        for (int i = 0; i < actualComputer; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void addComputer(Computer_33 computer) {
        if (actualComputer < MAX_COMPUTERS && computer != null) {
            computers[actualComputer] = computer;
            actualComputer++;
        } else {
            System.out.println("Sklep jest przepełniony");
        }
    }

    public void getInfo() {
        System.out.println("Komputery dostepne w sklepie: ");
        for (int i = 0; i < actualComputer; i++) {
            System.out.println(i + ". Producent: "
                    + computers[i].getProducer() + ". Model: " + computers[i].getModel());

        }

    }

    public int checkAvailability(Computer_33 find) {
        if (find == null)
            return 0;

        numberOfPieces = 0;
        for (int i = 0; i < actualComputer; i++) {
            if (find.equals(computers[i]))
                numberOfPieces++;



        }
        return numberOfPieces;
    }
}
