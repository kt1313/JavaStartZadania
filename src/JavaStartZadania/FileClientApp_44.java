package JavaStartZadania;

import java.io.*;
import java.util.Scanner;

public class FileClientApp_44 {
    private static final String CLIENTS_LIST = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\clients.csv";
    private static int numberOfLines = 0;
    private static double maxSpendings = 0;
    private static int macSpendingsId = 0;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readNumberOfLines("clients.csv");
        readFileAndCreateTableOfClients();
    }
    private static void readNumberOfLines(String CLIENTS_LIST) throws IOException, ClassNotFoundException {
        try {
            Scanner sc = new Scanner(new File(CLIENTS_LIST));
            sc.nextLine();
            while ((sc.nextLine()) != null) {
                numberOfLines++;
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static FileClient_44[] readFileAndCreateTableOfClients() throws IOException, ClassNotFoundException {
        FileClient_44[] clients = new FileClient_44[numberOfLines];
        try {
            Scanner sc = new Scanner(new File(CLIENTS_LIST));
            sc.nextLine();
            for (int i = 1; i < numberOfLines; i++) {
                String line = sc.nextLine();
                clients[i] = addClient(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    private static FileClient_44 addClient(String line) {
        String[] splittedLine = null;
        splittedLine = line.split(",");
        int id = Integer.parseInt(splittedLine[0]);
        String firstName = splittedLine[1];
        String lastName = splittedLine[2];
        String country = splittedLine[3];
        double spendings = Double.parseDouble(splittedLine[4]);
        return new FileClient_44(id, firstName, lastName, country, spendings);
    }


    private void findCountry(FileClient_44[] clients) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju: ");
        String country = sc.nextLine();
        int index = 0;
        FileClient_44[] countries = new FileClient_44[numberOfLines];
        for (FileClient_44 c : clients) {
            if (c.getCountry() == (country)) {
                countries[index] = c;
                index++;
                System.out.println(countries[index]);
            }
        }
        sc.close();

        double sum = 0;
        int numberOfCountries = 1;
        System.out.println("Z " + country + " jest " + index + " klientów.");
        for (FileClient_44 client:countries) {
            System.out.println(client.toString());
        }
        System.out.println("Srednio wydali" + (sum / numberOfCountries));
    }

    private void findMax(FileClient_44[] clients) {
        FileClient_44 maxSpendingsClient = clients[0];
        for (int i = 1; i < numberOfLines; i++) {
            if (clients[i].getSpendings() > maxSpendingsClient.getSpendings()) {
                maxSpendingsClient = clients[i];
            }
        }
        System.out.println("Najwięcej: " + maxSpendingsClient);
    }
}
