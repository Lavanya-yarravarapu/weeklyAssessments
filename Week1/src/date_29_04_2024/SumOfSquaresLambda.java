package date_29_04_2024;

import java.util.Arrays;

public class SumOfSquaresLambda {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sumOfSquares = Arrays.stream(numbers)
                                 .map(n -> n * n)
                                 .sum();
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
