package SHEET_01;

import java.util.Scanner;

public class Q01_even_odd {
    public static void check(int n) {
        if (n % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        check(n);

        sc.close();
    }
}
