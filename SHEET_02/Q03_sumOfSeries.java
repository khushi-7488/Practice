package SHEET_02;

public class Q03_sumOfSeries {
    public static double find(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find(4));
    }
}
