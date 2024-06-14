package date_01_05_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateProduct {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/Assessments";
        String user = "lavanya29";  
        String password = "lavanya@123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();

        String query = "UPDATE products SET price = ? WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setInt(2, productId);
            preparedStatement.executeUpdate();

            System.out.println("Record updated successfully.");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
