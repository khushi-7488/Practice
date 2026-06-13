package SHEET_01;

import java.util.Scanner;

public class Q19_primeInRange {
    public static boolean find(int n) {
        if (n < 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range");
        int start = sc.nextInt();
        System.out.println("enter end range");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (find(i)) {
                System.out.println(i);
            }
        }
    }
}
