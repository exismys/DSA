package general;// CodeChef: https://www.codechef.com/MARCH221C/submit/SUB_XOR

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int length = scanner.nextInt(); // To satisfy test cases
            String string = scanner.next();
            ArrayList<Integer> decimalArray = getArray(string);

            int beauty = 0;
            for (int num: decimalArray) {
                beauty = beauty ^ num;
            }
            System.out.println(beauty);
        }
    }

    private static ArrayList<Integer> getArray(String binary) {
        ArrayList<String> array = new ArrayList<>();
        generateArray(binary, 0, binary.length() - 1, array);

        // Converting string array to decimal array
        System.out.println(array);
        ArrayList<Integer> decArray = new ArrayList<>();
        for (String str: array) {
            decArray.add(Integer.parseInt(str, 2));
        }
        System.out.println(decArray);
        return decArray;
    }

    private static void generateArray(String b, int start, int end, ArrayList<String> array) {
       int length = end - start + 1;

       for (int l = 1; l <= length; l++) {
           for (int i = start; i <= length - l; i++) {
               array.add(b.substring(i, i + l));
           }
       }

    }
}
