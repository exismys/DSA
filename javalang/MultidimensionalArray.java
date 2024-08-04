package javalang;

public class MultidimensionalArray {
    public static void changeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] += 1;
            }
        }
    }

    public static void printMatrix(int[][] matrix, int rowLength, int colLength) {
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Elements are one ahead
        }
    }

    public static void main(String[] args) {
        // A 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Passing matrix as an argument to a function
        changeMatrix(matrix);
        // Printing the changed matrix
        printMatrix(matrix, 3, 3);
    }
}
