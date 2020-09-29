package JavaStartZadania;

import java.io.*;
import java.util.Scanner;

public class FileCompanyApp {

    private static final String COMPANY_NAME = "JakaPaka";
    private static final int GET_FM_USER = 1;
    private static final int GET_FM_FILE = 2;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("Wybierz formę wprawadzania danych: ");
        System.out.println("Wpisywanie z klawiatury:            - " + GET_FM_USER);
        System.out.println("Wczytywanie i wyświetlanie z pliku: - " + GET_FM_FILE);

        choice = sc.nextInt();
        sc.nextLine();
        if (choice ==1) {
                FileCompany_43 company = createCompany();
                writeFile(company);
            }else
            if(choice == 2) {
                try {
                    FileCompany_43 company = readFile();
                    System.out.println(company);
                } catch (IOException | ClassNotFoundException e){
                    System.err.println("Błąd odczytu danych");
                }
            }
                sc.close();
    }

    private static void writeFile(FileCompany_43 company) {
        try (
                var fis = new FileOutputStream(COMPANY_NAME);
                var oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(company);
            System.out.println("Zapisano dane do pliku");;
            }
        catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + COMPANY_NAME);
        }
    }
    private static FileCompany_43 readFile()throws IOException, ClassNotFoundException{
        try(
                var fis = new FileInputStream(COMPANY_NAME);
                var ois = new ObjectInputStream(fis);
        ) {
            return (FileCompany_43) ois.readObject();
        }
    }
    private static FileCompany_43 createCompany() {
        FileCompany_43 company = new FileCompany_43();
        for (int i = 0; i < FileCompany_43.EMPLOYEE_NO; i++) {
            System.out.println("Wprowadź imię:");
            String firstName = sc.nextLine();
            System.out.println("Wprowadź nazwisko:");
            String lastName = sc.nextLine();
            System.out.println("Wprowadź wypłatę:");
            double salary = sc.nextDouble();
            sc.nextLine();
            company.addEmployee(new FileEmployee_43(firstName, lastName, salary));
        }
        return company;
    }
}
