package date_30_04_2024;

import java.util.Arrays;
import java.util.List;

public class FilterStringsWithA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        strings.stream()
               .filter(s -> s.startsWith("A") || s.startsWith("a"))
               .forEach(System.out::println);
    }
}
