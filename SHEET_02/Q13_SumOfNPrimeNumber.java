package SHEET_02;

public class Q13_SumOfNPrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void find(int n) {
        int num = 2;
        int sum = 0;
        int count = 0;

        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        find(4);
    }
}
