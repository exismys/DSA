package arrays;

public class MaximumSumSubarray {

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 2};
        System.out.println(maxSum(arr));
    }

    // Kadane's Algorithm: Iterative Dynamic Programming Algorithm
    public static int maxSum(int[] arr) {
        int length = arr.length;
        int maxSum = 0, res = 0;

        for (int i = 0; i < length; i++) {
            maxSum = Math.max(maxSum + arr[i], arr[i]);
            res = Math.max(res, maxSum);
        }
        return res;
    }
}
