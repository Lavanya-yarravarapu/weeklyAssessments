package date_26_04_2024;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);
        list.add("Hello");
        list.add(3.14);

        for (Object element : list) {
            System.out.println(element);
        }
    }
}

