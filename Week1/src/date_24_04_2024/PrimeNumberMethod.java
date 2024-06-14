package date_24_04_2024;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = isPrime(number);
        System.out.println(number + " is prime: " + isPrime);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

