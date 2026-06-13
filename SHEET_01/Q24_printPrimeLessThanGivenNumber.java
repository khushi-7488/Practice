package SHEET_01;

public class Q24_printPrimeLessThanGivenNumber {
    public static boolean check(int n) {
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

    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
}
