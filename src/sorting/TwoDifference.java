package sorting;

// https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1

import java.util.Arrays;

public class TwoDifference {
    public static boolean isPair(int[] arr, int n) {
        if (arr.length < 2) {
            return false;
        }

        Arrays.sort(arr);

        int i = 0;
        int j = 1;

        while (j != arr.length) {
            int diff = arr[j] - arr[i];
            if (diff < n) {
                j++;
            } else if (diff > n) {
                i++;
                if (i == j) {
                    j++;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int[] arr = {5, 20, 3, 2, 5, 80};
        System.out.println(isPair(arr, 78));
    }
}
