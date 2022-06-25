package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJumpCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] memo = new int[arr.length];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = Math.abs(arr[1] - arr[0]);
        System.out.println(getMinCost(arr, arr.length - 1, memo));
    }

    static int getMinCost(int[] arr, int i, int[] memo) {
        if (memo[i] != -1) return memo[i];
        int val1 = Math.abs(arr[i] - arr[i - 1]) + getMinCost(arr, i - 1, memo);
        int val2 = Math.abs(arr[i] - arr[i - 2]) + getMinCost(arr, i - 2, memo);
        memo[i] = Math.min(val1, val2);
        return memo[i];
    }
}
