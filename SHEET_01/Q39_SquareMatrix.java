package SHEET_01;

public class Q39_SquareMatrix {

    public static void find(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
                System.out.print(count + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        find(4);
    }
}