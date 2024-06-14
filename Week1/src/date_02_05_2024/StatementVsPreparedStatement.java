package date_02_05_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StatementVsPreparedStatement {
    public static void main(String[] args) {
    	 String url = "jdbc:mysql://localhost:3306/Assessments";
         String user = "lavanya29";  
         String password = "lavanya@123"; 
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            // Using Statement
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM employees WHERE age > 30";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Using Statement:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") + ", Age: " + resultSet.getInt("age"));
            }

            // Using PreparedStatement
            String preparedQuery = "SELECT * FROM employees WHERE age > ?";
            PreparedStatement preparedStatement = connection.prepareStatement(preparedQuery);
            preparedStatement.setInt(1, 30);
            ResultSet preparedResultSet = preparedStatement.executeQuery();
            System.out.println("Using PreparedStatement:");
            while (preparedResultSet.next()) {
                System.out.println("ID: " + preparedResultSet.getInt("id") + ", Name: " + preparedResultSet.getString("name") + ", Age: " + preparedResultSet.getInt("age"));
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

