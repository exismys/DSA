package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void generateCombinations(int[] candidates, List<List<Integer>> combinations, List<Integer> combination, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            combinations.add(new ArrayList<>(combination));
        }
        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            generateCombinations(candidates, combinations, combination, remain - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }

    public static List<List<Integer>> getCombinations(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(candidates, combinations, new ArrayList<>(), target, 0);
        return combinations;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> combinations = getCombinations(candidates, target);
        System.out.println(combinations);
    }
}
