package SHEET_02;

public class Q19_PerfectSquareInRange {
    public static boolean find(int n) {
        if (n < 0) {
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void check(int n) {
        for (int j = 1; j <= n; j++) {
            if (find(j)) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
       check(20);
    }
}