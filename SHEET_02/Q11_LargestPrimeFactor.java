package SHEET_02;

public class Q11_LargestPrimeFactor {
    public static int find(int n) {
        if (n < 2) {
            return 0;
        }
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (max < i) {
                    max = i;
                }
                while (n % i == 0) {
                    n = n / i;
                }
            }
           
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(find(28));
    }
}
