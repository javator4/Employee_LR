package pl.sda.employee.controller;

import lombok.AllArgsConstructor;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

@AllArgsConstructor
public class EmployeeController {
    private EmployeeService service;
    private EmployeeView view;

    public void prepareEmployee(){
        // Pobierz dane
        // Stwórz obiekt Employee
        // Wyślij obiekt do EmployeeService.addEmployee
        Scanner input = new Scanner(System.in);
        String name, lastName;
        char sex;
        int departmentID;
        System.out.print("Imię pracownika: ");
        name=input.nextLine();
        System.out.print("Nazwisko pracownika: ");
        lastName=input.nextLine();
        System.out.print("Płeć (M/K): ");
        sex=input.nextLine().charAt(0);
        System.out.print("Numer działu: ");
        departmentID=input.nextInt();
        System.out.println();

        Employee newEmployee = new Employee(name, lastName, sex, departmentID);
        service.addEmployee(newEmployee);
    }

    public void showEmployees(){
        view.showAllEmployees();
    }
}
