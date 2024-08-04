package recursion;

import java.util.ArrayList;

public class GenerateSubsets {
    private static ArrayList<String> subsets;

    // TC: O(2^n) where n is the length of substring
    private static void generate(String string, String current, int index) {
        if (index == string.length()) {
            subsets.add(current);
            return;
        }
        generate(string, current, index + 1);
        generate(string, current + string.charAt(index), index + 1);
    }

    public static ArrayList<String> generateSubsets(String string) {
        subsets = new ArrayList<>();
        generate(string, "", 0);
        return subsets;
    }

    public static void main(String[] args) {
        System.out.println(generateSubsets("ABC")); // [, C, B, BC, A, AC, AB, ABC]
    }
}
