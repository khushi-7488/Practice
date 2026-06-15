package SHEET_01;

public class Q38_SumOfSquaresOfDigit {
    public static void find(int n) {
        int digit = 0;
        int sum = 0;
        while (n != 0) {
            digit = n % 10;
            sum = sum + (int) (Math.pow(digit, 2));
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        find(123);
    }
}
