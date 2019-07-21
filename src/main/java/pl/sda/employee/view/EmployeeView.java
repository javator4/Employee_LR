package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDatabase;

public class EmployeeView {

    public void showAllEmployees(){
        // 1. Imię: Nazwisko: Płeć:
        // 2. Imię: Nazwisko: Płeć:
        for(int i=0; i<EmployeeDatabase.employeeList.size(); i++){
            System.out.printf("%d %s", i+1, EmployeeDatabase.employeeList.get(i));
        }
    }
}
