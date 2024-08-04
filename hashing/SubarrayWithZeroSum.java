package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(isSubarray(arr));
    }

    public static boolean isSubarray(int[] arr) {
        /**
         * Using map for fun; Set would be most appropriate here.
         */
        Map<Integer, Integer> prefixSums = new HashMap<>();
        int prefixSum = 0;
        prefixSums.put(prefixSum, 0);
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if (prefixSums.containsKey(prefixSum)) {
                return true;
            } else {
                prefixSums.put(prefixSum, 0);
            }
        }
        return false;
    }
}
