package SHEET_01;

public class Q48_sumOfPrimeFactors {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void find(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 12;
        find(n);
    }
}
