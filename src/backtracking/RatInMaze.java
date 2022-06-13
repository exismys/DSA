package backtracking;

public class RatInMaze {
    private static int[][] solutionMatrix;

    public static int[][] getSolutionMatrix(int[][] maze, int matrixLength) {
        solutionMatrix = new int[matrixLength][matrixLength];
        solveMaze(maze, matrixLength, 0, 0);
        return solutionMatrix;
    }

    private static boolean solveMaze(int[][] maze, int matrixLength,  int row, int column) {

        if (row == matrixLength - 1 && column == matrixLength - 1 && maze[row][column] == 1) {
            solutionMatrix[row][column] = 1;
            return true;
        }

        if (row < matrixLength && column < matrixLength && maze[row][column] == 1) {
            solutionMatrix[row][column] = 1;

            if (solveMaze(maze, matrixLength, row + 1, column))
                return true;
            if (solveMaze(maze, matrixLength, row, column + 1))
                return true;

            solutionMatrix[row][column] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int[][] solutionMatrix = getSolutionMatrix(maze, maze.length);

        // Print path
        for (int i = 0; i < solutionMatrix.length; i++) {
            for (int j = 0; j < solutionMatrix.length; j++) {
                if (solutionMatrix[i][j] == 1)
                    System.out.println(i + ", " + j);
            }
        }
    }
}
