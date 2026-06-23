package SHEET_01;

import java.util.Scanner;

public class Q25FindNumberOfDigits {
    public static int find(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(find(n));
        sc.close();
    }
}