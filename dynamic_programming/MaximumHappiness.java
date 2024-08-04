package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumHappiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] points = new int[n][3];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 3; j++) {
                points[i][j] = scanner.nextInt();
            }
        }
        int[][] memo = new int[n][3];
        for (int i = 0; i < n; i++) Arrays.fill(memo[i], -1);
        System.out.println(Math.max(getMaxPoints(points, 0, 0, memo), Math.max(getMaxPoints(points, 0, 1, memo), getMaxPoints(points, 0, 2, memo))));
    }

    private static int getMaxPoints(int[][] points, int i, int prevSelected, int[][] memo) {
        if (i == points.length) {
            return 0;
        }

        if (prevSelected >= 0 && memo[i][prevSelected] != -1) return memo[i][prevSelected];

        int maxPoints = Integer.MIN_VALUE;
        for (int j = 0; j < 3; j++) {
            if (j == prevSelected) continue;
            maxPoints = Math.max(maxPoints, points[i][j] + getMaxPoints(points, i + 1, j, memo));
        }
        memo[i][prevSelected] = maxPoints;
        return memo[i][prevSelected];
    }
}
