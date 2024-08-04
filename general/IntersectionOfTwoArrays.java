package general;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static int[] getIntersection(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i != num1.length && j != num2.length) {
            if (num1[i] < num2[j]) {
                i++;
            } else if (num1[i] > num2[j]) {
                j++;
            } else {
                if (i == 0 || num1[i] != num1[i - 1]) {
                    list.add(num1[i]);
                }
                i++; j++;
            }
        }

        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2, 2};
        for (int num: getIntersection(arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
