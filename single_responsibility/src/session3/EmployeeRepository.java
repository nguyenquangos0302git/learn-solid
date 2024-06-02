package session3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {

    public void save(Employee employee) {
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

}
