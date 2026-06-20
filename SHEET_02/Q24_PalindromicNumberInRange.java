package SHEET_02;

public class Q24_PalindromicNumberInRange {
    public static boolean find(int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10) {
            return true;
        }
        int digit = 0;
        int copy = n;
        int reverse = 0;
        while (copy != 0) {
            digit = copy % 10;
            reverse = copy * 10 + digit;
            copy = copy / 10;
        }
        if (reverse == n) {
            return true;
        }
        return false;

    }

    public static void range(int n) {
        for (int i = 1; i <= n; i++) {
            if (find(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        range(100);
    }
}
