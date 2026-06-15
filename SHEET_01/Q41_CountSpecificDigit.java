package SHEET_01;

public class Q41_CountSpecificDigit {
    public static int check(int n, int digit) {
        int count = 0;
        int num = n;

        int dig;
        while (num != 0) {
            dig = num % 10;
            num = num / 10;
            if (dig == digit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(check(122333, 3));
    }
}
