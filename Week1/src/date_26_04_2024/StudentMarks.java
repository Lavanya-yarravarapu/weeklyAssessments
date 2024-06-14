package date_26_04_2024;

import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("John", 85);
        studentMarks.put("Jane", 92);
        studentMarks.put("Jack", 78);

        for (String name : studentMarks.keySet()) {
            System.out.println(name + ": " + studentMarks.get(name));
        }
    }
}

