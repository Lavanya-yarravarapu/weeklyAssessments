package date_24_04_2024;

public class ReverseStringMethod {
    public static void main(String[] args) {
        String str = "Hello";
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

