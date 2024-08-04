package javalang;

import java.util.Arrays;

public class GeneralTests {
    public static void main(String[] args) {
        System.out.println(0 % 2 == 0); // true
        System.out.println(Integer.MIN_VALUE);

        // Arrays.sort()
        int[] array = {10, 5, 2, 7, 30};
        Arrays.sort(array);
        for (int num: array) {
            System.out.print(num + " ");
        }

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            System.out.println(arr[i]);
        }

    }
}
