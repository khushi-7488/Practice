package SHEET_01;

public class Q40_sumOfDigitUntilSingleDigit {

    public static int check(int n) {
        while (n > 9) {
            int digit, sum = 0;
            while (n != 0) {

                digit = n % 10;
                sum = sum + digit;
                n = n / 10;

            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 9875;
        System.out.println(check(n));
    }
}
