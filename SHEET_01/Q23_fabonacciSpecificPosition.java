package SHEET_01;

public class Q23_fabonacciSpecificPosition {
    public static int check(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = check(n - 1);
        int b = check(n - 2);
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(check(n));
    }
}
