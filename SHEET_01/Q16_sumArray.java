package SHEET_01;

public class Q16_sumArray {

    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 5 };
        sum(arr);
    }
}
