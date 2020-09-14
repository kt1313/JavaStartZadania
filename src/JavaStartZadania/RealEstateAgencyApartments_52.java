package JavaStartZadania;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RealEstateAgencyApartments_52 {
    private static final String APARTMENTS_LIST = "C:\\Users\\Dell\\IdeaProjects\\JavaStart\\src\\wycena";
    private static final int NUMBER_OF_APRTMNTS = 10;
    public static RealEstateApartments_52[] apartments = new RealEstateApartments_52[NUMBER_OF_APRTMNTS];


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readFileAndCreateTableOfAprtmnts();
        System.out.println("Nieuporządkowane: ");
        printData();
        System.out.println("Uporządkowane: ");
        Arrays.sort(apartments);
        printData();

    }


    private static RealEstateApartments_52[] readFileAndCreateTableOfAprtmnts() throws IOException, ClassNotFoundException {
        try {
            Scanner sc = new Scanner(new File(APARTMENTS_LIST));
            sc.nextLine();
            for (int i = 0; i < NUMBER_OF_APRTMNTS; i++) {
                String line = sc.nextLine();
                apartments[i] = addApartment(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apartments;
    }

    private static RealEstateApartments_52 addApartment(String line) {
        String[] splittedLine = null;
        splittedLine = line.split(";");
        String city = splittedLine[0];
        int price = Integer.parseInt(splittedLine[1]);
        int square = Integer.parseInt(splittedLine[2]);
        double pricePerMeter =(double) price/square;
        return new RealEstateApartments_52(city, price, square, pricePerMeter);
    }

    private static void printData() {
        for (RealEstateApartments_52 rA : apartments) {
            System.out.println(rA);
        }
    }

}
