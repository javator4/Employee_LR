package pl.sda.employee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private String name, lastName;
    private char sex;
    private int departmentID;

    @Override
    public String toString() {
        return "Imię: " +name + " | Nazwisko: " +lastName + " | Płeć: " +sex+"\n";
    }
}
