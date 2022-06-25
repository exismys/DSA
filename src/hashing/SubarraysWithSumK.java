package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, -1, 0};
        System.out.println(getNumber(arr, 2));
        System.out.println(getNumber(arr2, 3));
        System.out.println(getNumber(arr3, 0));
    }

    public static int getNumber(int[] arr, int k) {
        // Set would be more appropriate here as we are only storing the key i.e. prefix sum
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(prefixSum, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
