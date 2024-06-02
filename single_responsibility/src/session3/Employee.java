package session3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

    private String employeeId;
    private String employeeType;

    public void save() {
        new EmployeeRepository().save(this);
    }

}
