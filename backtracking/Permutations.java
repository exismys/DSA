package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode #46
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {
    public static void generatePermutations(int[] arr, List<List<Integer>> permutations, List<Integer> permutation, int start) {
        if (start == arr.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            permutation.add(arr[i]);
            swap(arr, start, i);
            generatePermutations(arr, permutations, permutation, start + 1);
            permutation.remove(permutation.size() - 1);
            swap(arr, start, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<List<Integer>> getPermutations(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        generatePermutations(arr, permutations, permutation, 0);
        return permutations;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(getPermutations(arr));
    }
}
