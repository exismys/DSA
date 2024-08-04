package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode #60
 * https://leetcode.com/problems/permutation-sequence/
 */

public class PermutationSequence {
    public static void generatePermutations(ArrayList<Integer> arr, int n, int[] fact, List<Integer> permutation, int k) {
        if (permutation.size() == fact.length) {
            return;
        }

        int index = k / fact[n - 1];
        permutation.add(arr.get(index));
        arr.remove(index);
        k = k - (index * fact[n - 1]);
        generatePermutations(arr, n - 1, fact, permutation, k);
    }

    public static List<Integer> getPermutations(int n, int k) {
        // Preprocessing: calculating factorials
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }

        List<Integer> permutation = new ArrayList<>();
        generatePermutations(nums, n, fact, permutation, k - 1);
        return permutation;
    }

    public static void main(String[] args) {
        System.out.println(getPermutations(3, 3));
    }
}
