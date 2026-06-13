package SHEET_01;

public class Q22_oddSum {
    public static int find(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum is " + find(1, 10));
    }
}
