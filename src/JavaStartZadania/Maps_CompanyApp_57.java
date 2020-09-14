package JavaStartZadania;

import java.util.Scanner;

public class Maps_CompanyApp_57 {

        private static final int ADD_EMPLOYEE = 0;
        private static final int FIND_EMPLOYEE = 1;
        private static final int EXIT = 2;

        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Maps_Company_57 company = new Maps_Company_57();
            int userOption;
            do {
                printOptions();
                System.out.println("Wybierz opcję:");
                userOption = sc.nextInt();
                sc.nextLine();
                switch (userOption) {
                    case ADD_EMPLOYEE:
                        Maps_Employee_57 employee = readAndCreateEmployee();
                        company.addEmployee(employee);
                        break;
                    case FIND_EMPLOYEE:
                        findEmployee(company);
                        break;
                    case EXIT:
                        System.out.println("Papa!");
                }
            } while (userOption != EXIT);
        }

        private static void findEmployee(Maps_Company_57 company) {
            System.out.println("Podaj imię:");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = sc.nextLine();
            Maps_Employee_57 employee = company.getEmployee(firstName, lastName);
            if (employee == null)
                System.out.println("Brak takiego pracownika");
            else
                System.out.println(employee);
        }

        private static Maps_Employee_57 readAndCreateEmployee() {
            System.out.println("Podaj imię:");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = sc.nextLine();
            System.out.println("Podaj wypłatę:");
            double salary = sc.nextDouble();
            sc.nextLine();

            return new Maps_Employee_57(firstName, lastName, salary);
        }

        private static void printOptions() {
            System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
            System.out.println(FIND_EMPLOYEE + " - Wyszukiwanie pracownika");
            System.out.println(EXIT + " - Wyjście z programu");
        }
    }