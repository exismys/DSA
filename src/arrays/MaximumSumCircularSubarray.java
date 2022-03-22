package arrays;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] array = {-5, 8, -1, 6, -10, 4};
        System.out.println(maxSum(array));
    }

    public static int maxSum(int[] arr) {
        int maxSumNormal = MaximumSumSubarray.maxSum(arr);
        if (maxSumNormal < 0) {
            return maxSumNormal;
        }
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = - arr[i];
        }

        int maxSumCircular = arrSum - MaximumSumSubarray.maxSum(arr);
        return Math.max(maxSumNormal, maxSumCircular);
    }
}
