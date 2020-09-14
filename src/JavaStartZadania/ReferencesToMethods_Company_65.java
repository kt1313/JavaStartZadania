package JavaStartZadania;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

 class ReferencesToMethods_Company_65 {

    public static void main(String[] args) {
        List<ReferencesToMethods_Employee_65> employees = createEmployees();

        //10% podwyżki dla pracowników zatrudnionych na pełen etat
        addBonusToFullTimeEmployees(employees);

        //liczba pracowników etatowych
        double fullTimeEmployeesNumber = countEmployeesByEmployment(employees, ReferencesToMethods_Employment_65.FULL_TIME);

        System.out.println("Liczba pracowników zatrudnionych na pełen etat: " + fullTimeEmployeesNumber);
        System.out.println("Oto oni:");

        employees.stream().filter(ReferencesToMethods_Employee_65::filterFullTime)
                .forEach(System.out::println);

        employeeWithLongestName(employees)
                .ifPresent(ReferencesToMethods_Company_65::showLongestName);
    }

    private static void addBonusToFullTimeEmployees(List<ReferencesToMethods_Employee_65> employees) {
        employees.stream()
                .filter(ReferencesToMethods_Employee_65::filterFullTime)
                .forEach(ReferencesToMethods_Employee_65::bonusToFullTimeSalary);

    }
    private static void showLongestName(String emp){
        System.out.println("Pracownik o najdłuższym imieniu i nazwisku to " + emp);
    }

    private static Optional<String> employeeWithLongestName(List<ReferencesToMethods_Employee_65> employees) {
        return employees.stream()
                .map(ReferencesToMethods_Employee_65::combineEmployeesName)
                .max(Comparator.comparingInt(String::length));
    }

    private static long countEmployeesByEmployment(List<ReferencesToMethods_Employee_65> employees, ReferencesToMethods_Employment_65 employment) {
        return employees.stream()
                .filter(ReferencesToMethods_Employee_65::filterFullTime)
                .count();
    }


    private static List<ReferencesToMethods_Employee_65> createEmployees() {
        return List.of(
                new ReferencesToMethods_Employee_65("Jan", "Kowalski", 4000, ReferencesToMethods_Employment_65.FULL_TIME),
                new ReferencesToMethods_Employee_65("Marta", "Baczewska", 3900, ReferencesToMethods_Employment_65.FULL_TIME),
                new ReferencesToMethods_Employee_65("Karol", "Piotrowicz", 5800, ReferencesToMethods_Employment_65.CONTRACT),
                new ReferencesToMethods_Employee_65("Anna", "Lubicz", 6000, ReferencesToMethods_Employment_65.PART_TIME),
                new ReferencesToMethods_Employee_65("Wojciech", "Kozłowski", 3500, ReferencesToMethods_Employment_65.PART_TIME),
                new ReferencesToMethods_Employee_65("Paweł", "Kowalski", 8000, ReferencesToMethods_Employment_65.FULL_TIME),
                new ReferencesToMethods_Employee_65("Adam", "Marchwicki", 300, ReferencesToMethods_Employment_65.CONTRACT)
        );
    }

}
