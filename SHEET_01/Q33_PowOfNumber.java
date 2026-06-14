package SHEET_01;

import java.util.Scanner;

public class Q33_PowOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int m = sc.nextInt();
        int pow = n * (m * m * m);
        System.out.println(pow);
    }
}
