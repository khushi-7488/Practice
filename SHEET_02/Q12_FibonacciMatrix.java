package SHEET_02;

public class Q12_FibonacciMatrix {
    public static int find(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return find(n - 1) + find(n - 2);
    }

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
        int i = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                matrix[j][k] = find(i++);
            }
        }

        printMatrix(matrix);
    }
}
