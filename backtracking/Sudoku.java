package backtracking;

import javalang.MultidimensionalArray;

public class Sudoku {

    public static boolean solveSudoku(int[][] sudoku, int n) {
        int row = -1;
        int col = -1;
        boolean emptyCell = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sudoku[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyCell = true;
                    break;
                }
            }
            if (emptyCell) break;
        }

        if (!emptyCell) {
            return true;
        }

        for (int num = 1; num <= n; num++) {
            if (safe(sudoku, row, col, num, n)) {
                sudoku[row][col] = num;
                if (solveSudoku(sudoku, n)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean safe(int[][] sudoku, int row, int col, int number, int n) {
        // Checking if the row already has the number
        for (int i = 0; i < n; i++) {
            if (sudoku[row][i] == number) {
                return false;
            }
        }

        // Checking if the column already has the number
        for (int i = 0; i < n; i++) {
            if (sudoku[i][col] == number) {
                return false;
            }
        }

        // Checking for grid
        int gridSize = (int) Math.sqrt(n);
        int rowStartIndex = row - (row % gridSize);
        int colStartIndex = col - (col % gridSize);
        for (int i = rowStartIndex; i < rowStartIndex + gridSize; i++) {
            for (int j = colStartIndex; j < colStartIndex + gridSize; j++) {
                if (sudoku[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        solveSudoku(sudoku, sudoku.length);
        MultidimensionalArray.printMatrix(sudoku, sudoku.length, sudoku.length);
    }
}
