package SHEET_01;

public class Q08_factorial {
    public static int print(int n) {
        if (n == 1) {
            return n;
        }

        int a = print(n - 1);
        int b = n * a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
