package date_25_04_2024;



import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Hello");
        list.add(3.14);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
