package date_29_04_2024;

import java.util.Arrays;
import java.util.List;

public class MaxElementLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);
        int max = numbers.stream()
                         .max(Integer::compareTo)
                         .orElseThrow();
        System.out.println("Maximum element: " + max);
    }
}
