package SHEET_01;

public class Q09_sumOfDigit {
    public static void find(int n) {
        int digit, sum = 0;
        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 152;
        find(n);
    }
}
