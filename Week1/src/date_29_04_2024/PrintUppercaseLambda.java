package date_29_04_2024;

import java.util.Arrays;
import java.util.List;

public class PrintUppercaseLambda {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "lambda");
        strings.stream()
               .map(String::toUpperCase)
               .forEach(System.out::println);
    }
}

