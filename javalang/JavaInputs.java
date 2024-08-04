package javalang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking a line of string as input
        String string = scanner.nextLine();
        System.out.println(string);

        // Taking space separated integers as input and making use of them
        // Method 1: Iterating over them using loop
        int ic = 10;
        List<Integer> list = new ArrayList<>(ic);
        while (ic-- != 0) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }

        // Method 2: Taking the whole line as input with nextLine() and splitting them
        List<Integer> numbers = new ArrayList<>();
        for (String i: scanner.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(i));
        }
        for (int num: numbers) {
            System.out.println(num + " ");
        }

    }
}
