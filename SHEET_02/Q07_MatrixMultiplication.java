package SHEET_02;

public class Q07_MatrixMultiplication {
    public static void find(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        find(3);
    }
}

