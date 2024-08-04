package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(getCombinations(candidates, target));
    }

    public static List<List<Integer>> getCombinations(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombinations(candidates, combinations, new ArrayList<>(), target, 0);
        return combinations;
    }

    public static void generateCombinations(int[] candidates, List<List<Integer>> combinations, List<Integer> combination, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            combinations.add(new ArrayList<>(combination));
        }
        for (int i = start; i < candidates.length; i++) {
            if (i - start > 0 && candidates[i] == candidates[i - 1]) continue;
            combination.add(candidates[i]);
            generateCombinations(candidates, combinations, combination, remain - candidates[i], i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
