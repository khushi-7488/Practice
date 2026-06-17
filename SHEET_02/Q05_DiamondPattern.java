package SHEET_02;

public class Q05_DiamondPattern {
    public static void find(int row) {
        int mid = (row / 2) + 1;
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= i * 2 - 1; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 4;
        find(row);
    }
}
