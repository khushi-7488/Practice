package SHEET_01;

public class Q37_perfectSquare {
    public static boolean find(int n) {
        if (n < 0) {

            return false;
        }
        for (int i = 1; i <= n/4; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find(16));
    }
}
