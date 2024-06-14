package date_26_04_2024;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}

