package date_31_04_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
    	 String url = "jdbc:mysql://localhost:3306/practice";
         String user = "lavanya29";
         String password = "lavanya@123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();

            System.out.println("Record inserted successfully.");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
