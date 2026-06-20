package SHEET_02;

public class Q23_SumOfDigitsOfProducts {
    public static void find(int num1, int num2) {
        int product = num1 * num2;
        int sum = 0, digit;
        while (product != 0) {
            digit = product % 10;
            sum += digit;
            product = product / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 34;
        find(num1, num2);
    }
}
