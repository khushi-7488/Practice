package SHEET_01;

public class Q26Narcissistic {

    public static int find(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void check(int n) {
        int num = n;
        int sum = 0, digit;
        int p = find(n);

        while (num != 0) {
            digit = num % 10;
            sum = sum + (int) (Math.pow(digit, p));
            num = num / 10;
        }
        if (n == sum) {
            System.out.println("narcissistic");
        } else {
            System.out.println("Not narcissistic");
        }
    }

    public static void main(String[] args) {
        check(13);
    }
}