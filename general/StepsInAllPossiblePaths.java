package general;

public class StepsInAllPossiblePaths {

    public static int noOfSteps(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int steps = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                steps += grid[i][j];
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                }
            }
        }
        System.out.println(noOfSteps(grid));
    }
}
