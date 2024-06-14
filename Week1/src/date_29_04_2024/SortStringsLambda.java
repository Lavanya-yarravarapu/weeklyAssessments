package date_29_04_2024;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsLambda {
    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "cherry", "date"};
        Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1));
        System.out.println(Arrays.toString(strings));
    }
}
