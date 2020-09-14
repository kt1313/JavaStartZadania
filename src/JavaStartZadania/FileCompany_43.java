package JavaStartZadania;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileCompany_43 implements Serializable {

    public static final int EMPLOYEE_NO = 3;
    int employment = 0;
    String companyName;
    public FileEmployee_43[] employees = new FileEmployee_43[EMPLOYEE_NO];


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void addEmployee(FileEmployee_43 employee) {
        //try(employee instanceof FileEmployee_43){
        if (employment < EMPLOYEE_NO) {
            employees[employment] = employee;
            employment++;
        } else System.out.println("Przykro nam, nie ma więcej wakatów.");
    }

    public void getEmployeeData(int employeeNo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię " + employeeNo + " pracownika: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko " + employeeNo + " pracownika: ");
        String lastName = sc.nextLine();
        System.out.println("Podaj wynagrodzenie " + employeeNo + " pracownika: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        addEmployee(new FileEmployee_43(firstName, lastName, salary));
        sc.close();

    }

    public String fileCreator(String companyName) {
        this.companyName = companyName;
        File file = new File(companyName);

        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists)
            System.out.println("Plik " + companyName + " istnieje lub został utworzony");
        return companyName;
    }




    public String printEmployeeData(FileEmployee_43[] employees, int employee) {
        //employees[1].salary;
        String firstName = employees[employee].getFirstName();
        String lastName = employees[employee].getFirstName();
        double salary = employees[employee].getSalary();
        String employeeData = ("" + firstName + ", " + lastName + ", " + salary);
        return employeeData;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (FileEmployee_43 employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
