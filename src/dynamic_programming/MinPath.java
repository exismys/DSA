package dynamic_programming;

public class MinPath {

    public static int[][] memo = new int[3][3];
    public static int minPath(int[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (i == 0 && j == 0) {
            return grid[i][j];
        }

        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        memo[i][j] = grid[i][j] + Math.min(minPath(grid, i - 1, j), minPath(grid, i, j - 1));
        return grid[i][j] + Math.min(minPath(grid, i - 1, j), minPath(grid, i, j - 1));


    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1, 2, 4},
                {2, 6, 7},
                {5, 10, 9}
        };

        System.out.println(minPath(grid,2, 2));
    }
}
