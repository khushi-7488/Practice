package SHEET_01;

import java.util.Scanner;

public class Q07_starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
