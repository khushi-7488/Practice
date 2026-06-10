package SHEET_01;

public class Q02_prime {
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(check(n));
    }
}
