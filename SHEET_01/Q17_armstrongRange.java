package SHEET_01;

import java.util.*;

public class Q17_armstrongRange {
    public static boolean find(int n) {
        int num = n;
        int newNum = 0, digit;
        while (num != 0) {
            digit = num % 10;
            newNum = newNum + (int) (Math.pow(digit, 3));
            num = num / 10;
        }
        if (newNum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number");
        int start = sc.nextInt();
        System.out.println("enter end number");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (find(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}