package SHEET_02;

public class Q10_PerfectNumberInLimit {
    public static void find(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int j = 1;
            while (j <= i / 2) {
                if (i % j == 0) {
                    sum += j;
                }
                j++;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        find(30);
    }
}
