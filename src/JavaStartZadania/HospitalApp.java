package JavaStartZadania;

import java.util.Scanner;

public class HospitalApp {
    private int maxPatient = 10;


    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Hospital_20 queue = new Hospital_20();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != exit) {
            System.out.print("Wybierz opcję: \n" + "0 - wyjdź z programu\n" + "1 - dopisz pacjenta\n" + "2 - wyświetl listę\n");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case exit:
                    System.out.println("Koniec programu");
                    break;
                case addPatient:
                    Patient_20 patient = new Patient_20();
                    System.out.println("Podaj imię pacjenta: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.println("Podaj nazwisko pacjenta: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.println("Podaj PESEL pacjenta: ");
                    patient.setNrPESEL(scanner.nextLine());
                    queue.addPatient(patient);
                    break;

                case printPatients:
                    queue.printQueue();
                    break;
                default:
                    System.out.println("Wybierz jeszcze raz.");
                    break;
            }
        }
        scanner.close();

    }

}
