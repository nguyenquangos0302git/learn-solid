package session1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

    private String employeeId;
    private String employeeType;

    public void save() {
        String object = "Value insert employee";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            statement = connection.createStatement();
            statement.execute("INSERT INTO EMPLOYEE VALUES (" + object + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void calculateTax() {
        if (employeeType.equals("fullName")) {

        }
        if (employeeType.equals("contract")) {

        }
    }

}
