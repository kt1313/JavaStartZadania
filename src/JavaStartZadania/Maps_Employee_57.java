package JavaStartZadania;

import java.util.Objects;

public class Maps_Employee_57 {
        private String firstName;
        private String lastName;
        private double salary;

        public Maps_Employee_57(String firstName, String lastName, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ", wypłata: " + salary;
        }
    }