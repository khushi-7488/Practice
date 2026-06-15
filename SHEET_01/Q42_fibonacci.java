package SHEET_01;

public class Q42_fibonacci {

    public static int find(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return find(n - 1) + find(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(find(i) + " ");
        }
    }
}
