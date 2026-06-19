package SHEET_02;

public class Q17_SpiralPattern {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int matrix[][] = new int[n][n];

        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                    matrix[startRow][i] = num++;
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
            matrix[i][endCol] = num++;
            }
            // bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                matrix[endRow][i] = num++;
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                matrix[i][startCol] = num++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        printMatrix(matrix);
    }
}
