package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> getSequentialDigits(int low, int high) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(low, high, numbers, i, 0);
        }
        Collections.sort(numbers);
        return numbers;
    }

    public static void dfs(int low, int high, List<Integer> numbers, int i, int ac) {
        if (ac >= low && ac <= high) {
            numbers.add(ac);
        }
        if (ac > high || i > 9) {
            return;
        }

        dfs(low, high, numbers, i + 1, ac * 10 + i);
    }

    public static void main(String[] args) {
        System.out.println(getSequentialDigits(100, 300));
    }
}
