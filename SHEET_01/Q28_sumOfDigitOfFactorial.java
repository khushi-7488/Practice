package SHEET_01;

public class Q28_sumOfDigitOfFactorial {
    public static int find(int n) {
        int sum = 0;
        if (n == 1 || n == 2) {
            return n;
        }
        int a = n * find(n - 1);
        while (a != 0) {
            int b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find(5));
    }
}
