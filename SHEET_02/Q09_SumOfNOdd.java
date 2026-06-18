package SHEET_02;

public class Q09_SumOfNOdd {
    public static int find(int n) {
        int sum = 0;
        int currentOdd = 1;
        for (int i = 1; i <= n; i++) {
            sum += currentOdd;
            currentOdd += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find(5));
    }
}
