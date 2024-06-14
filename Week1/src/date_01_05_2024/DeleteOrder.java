package date_01_05_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteOrder {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Assessments";
        String user = "lavanya29";  
        String password = "lavanya@123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order ID to delete: ");
        int orderId = scanner.nextInt();

        String query = "DELETE FROM orders WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, orderId);
            preparedStatement.executeUpdate();

            System.out.println("Record deleted successfully.");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
