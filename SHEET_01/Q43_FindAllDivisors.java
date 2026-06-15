package SHEET_01;

public class Q43_FindAllDivisors {
    public static void find(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 12;
        find(n);
    }
}
