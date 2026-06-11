// Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
package SHEET_01;

import java.util.*;

public class Q04_armstrong {
    public static void check(int n) {
        int num = n;
        int newNum = 0, digit;
        while (num != 0) {
            digit = num % 10;
            newNum = newNum + (int) (Math.pow(digit, 3));
            num = num / 10;
        }
        if (newNum == n) {
            System.out.println("Is armstrong");
        } else {
            System.out.println("Not an armstrong");
        }
    }

    public static void main(String[] args) {
        int n = 153;
        check(n);
    }
}
