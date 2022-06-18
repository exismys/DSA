package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println(getCombinations(3, 9));
    }

    public static List<List<Integer>> getCombinations(int k, int n) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(k, n, 1, combinations, new ArrayList<>());
        return combinations;
    }

    public static void generateCombinations(int k, int n, int cn, List<List<Integer>> combinations, List<Integer> combination) {
        if (n < 0 || k < 0) return;
        if (k == 0 && n == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        for (int i = cn; i <= 9; i++) {
            combination.add(i);
            generateCombinations(k - 1, n - i, i + 1, combinations, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
