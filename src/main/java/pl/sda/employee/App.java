package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class App 
{
    private static final int ADD_EMPLOYEE = 1;
    private static final int SHOW_EMPLOYEES = 2;
    private static final int RAGEQUIT = 9;

    public static void main( String[] args )
    {
        EmployeeDatabase.employeeList.add(new Employee("Robin", "Schudł", 'M', 3));

        for (Employee e : EmployeeDatabase.employeeList){
            System.out.println(e);
        }
        EmployeeController employeeController = new EmployeeController(new EmployeeService(), new EmployeeView());

        boolean run = true;
        while (run){
            System.out.println( "1. Dodaj pracownika\n"+
                    "2. Pokaż pracowników\n" +
                    "9. Wyjdź");

            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            switch (value){
                case ADD_EMPLOYEE:
                    employeeController.prepareEmployee();
                    break;
                case SHOW_EMPLOYEES:
                    employeeController.showEmployees();
                    break;
                case RAGEQUIT:
                    run = !run;
                    break;
            }
        }
    }
}
