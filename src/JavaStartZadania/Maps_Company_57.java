package JavaStartZadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Company_57 {

    private Map<String, Maps_Employee_57> employees = new HashMap<>();

    boolean addEmployee(Maps_Employee_57 employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();

        if (employees.containsKey(key)) {
            return false;
        }
        employees.put(key, employee);
        return true;
    }

    Maps_Employee_57 getEmployee(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return employees.get(key);
    }
}