package pl.sda.employee.database;

import pl.sda.employee.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> employeeList = new ArrayList<>(
            Arrays.asList(new Employee("Jan", "Kowalski", 'M', 1),
                    new Employee("Henryk", "Nowak", 'M', 1),
                    new Employee("Magda", "Bogdan", 'K', 3),
                    new Employee("Stefan", "Batony", 'M', 2),
                    new Employee("Katarzyna", "Delma", 'K', 2))
    );
}
