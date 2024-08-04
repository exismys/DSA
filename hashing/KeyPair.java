package hashing;

import java.util.HashSet;
import java.util.Set;

public class KeyPair {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(isKeyPair(arr, 16));
    }

    public static boolean isKeyPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target - arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
