package SHEET_01;

public class Q21_evenSum {
    public static int find(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 20;
        System.out.println(" sum is " + find(start, end));
    }
}
