package SHEET_02;

import java.util.Scanner;

public class Q15_SumOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(sum);
        sc.close();
    }
}
