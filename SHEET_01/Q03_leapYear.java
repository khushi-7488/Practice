package SHEET_01;

public class Q03_leapYear {
    public static void check(int n) {
        if (n % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }

    public static void main(String[] args) {
        check(234012);
    }
}
