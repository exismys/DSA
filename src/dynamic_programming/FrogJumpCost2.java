package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJumpCost2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long[] memo = new long[n];
        Arrays.fill(memo, -1);
        System.out.println(getMinCost(arr, arr.length - 1, k, memo));
    }

    private static long getMinCost(int[] arr, int i, int k, long[] memo) {
        if (i == 0) return 0;
        if (memo[i] != -1) return memo[i];

        long min = Long.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (i - j < 0) break;
            min = Math.min(min, Math.abs(arr[i] - arr[i - j]) + getMinCost(arr, i - j, k, memo));
        }
        memo[i] = min;
        return memo[i];
    }
}
