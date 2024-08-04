package backtracking;

public class NQueen {

    private static int[][] solutionMatrix;

    public static int[][] getSolutionMatrix(int n) {
        solutionMatrix = new int[n][n];
        arrangeQueen(0, n);
        return solutionMatrix;
    }

    private static boolean arrangeQueen(int col, int n) {
        if (col == n) {
            return true;
        }

        for (int row = 0; row < n; row++) {
            if (safe(row, col, n)) {
                solutionMatrix[row][col] = 1;
                if (arrangeQueen(col + 1, n)) {
                    return true;
                };
                solutionMatrix[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean safe(int row, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (solutionMatrix[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (solutionMatrix[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (solutionMatrix[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] solutionMatrix = getSolutionMatrix(5);
        for (int i = 0; i < solutionMatrix.length; i++) {
            for (int j = 0; j < solutionMatrix.length; j++) {
                System.out.print(solutionMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
