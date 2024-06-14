package date_30_04_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "stream");
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());
        System.out.println(uppercaseStrings);
    }
}
