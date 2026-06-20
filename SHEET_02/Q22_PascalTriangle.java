package SHEET_02;

public class Q22_PascalTriangle {
    public static void find(int row) {
        for (int i = 0; i < row; i++) {
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                // Efficiently calculate the next value in the row based on the current one
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        find(3);
    }
}
