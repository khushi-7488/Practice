package SHEET_01;

public class Q47_NumberOfPyramid {
    public static void find(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        find(3);
    }
}
