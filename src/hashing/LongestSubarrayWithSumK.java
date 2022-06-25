package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(getLength(arr, 15));
    }

    public static int getLength(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int length = 0;
        map.put(prefixSum, -1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if (map.containsKey(prefixSum - k)) {
                length = Math.max(length, i - map.get(prefixSum - k));
            }
            if (!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
        }

        return length;
    }
}
