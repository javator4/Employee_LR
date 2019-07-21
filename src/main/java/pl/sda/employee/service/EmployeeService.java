package pl.sda.employee.service;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;

public class EmployeeService {
    public void addEmployee(Employee employee){
        EmployeeDatabase.employeeList.add(employee);
    }
}
