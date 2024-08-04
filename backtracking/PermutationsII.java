package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode #47
 * https://leetcode.com/problems/permutation-sequence/
 */
public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(getPermutations(nums));
    }

    public static List<List<Integer>> getPermutations(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        Arrays.sort(arr);
        generatePermutations(arr, permutations, permutation, visited);
        return permutations;
    }

    public static void generatePermutations(int[] arr, List<List<Integer>> permutations, List<Integer> permutation, boolean[] visited) {
        if (permutation.size() == arr.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) {
                continue;
            }
            permutation.add(arr[i]);
            visited[i] = true;
//            swap(arr, start, i); The swap technique does not work for where we have to deal with duplicates because it changes the sorted order of the original array in the consecutive recursion call.
            // Employing another technique which makes use of a boolean array to keep track of elements that have been fixed previously.
            generatePermutations(arr, permutations, permutation, visited);
            permutation.remove(permutation.size() - 1);
//            swap(arr, start, i);
            visited[i] = false;
        }
    }

//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
