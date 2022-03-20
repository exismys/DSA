package javalang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {
    public static void changeList(ArrayList<String> list) {
        list.set(0, "good morning");
        list.set(1, "good night");
        list.set(2, "good evening");
    }

    public static void printList(ArrayList<String> list) {
        for (String str: list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("morning");
//        list.add("night");
//        list.add("evening");
//        changeList(list);
//        System.out.println(list);

        // Removing index vs object
        Integer[] array = {5, 2, 1, 10, 15, 6, 19};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        list.remove(5);// Removes element at index 5
        System.out.println(list);
        list.remove(new Integer(5)); // Removes element with value 5
        System.out.println(list);
    }
}
