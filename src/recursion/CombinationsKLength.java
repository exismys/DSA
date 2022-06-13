package recursion;

import java.util.Scanner;

/**
 * Leetcode #77
 * https://leetcode.com/problems/combinations/
 */

public class CombinationsKLength {
    public static void generateCombinations(int beg, int end, int k, String output) {
        if (output.length() == k) {
            System.out.println(output);
            return;
        }

        for (int i = beg; i <= end; i++) {
            generateCombinations(i + 1, end, 2, output + Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generateCombinations(1, n, 2, "");
    }
}
