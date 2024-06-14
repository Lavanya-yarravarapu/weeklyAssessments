package date_31_04_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "lavanya29";
        String password = "lavanya@123";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") + ", Age: " + resultSet.getInt("age"));
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
