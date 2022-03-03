package javalang;

import java.util.ArrayList;

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
        ArrayList<String> list = new ArrayList<>();
        list.add("morning");
        list.add("night");
        list.add("evening");
        changeList(list);
        System.out.println(list);
    }
}
