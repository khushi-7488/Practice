package SHEET_01;

public class Q32_MedianOfArray {
    public static void find(int arr[], int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        find(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 6, 9, 7, 1, 0, 6 };
        int n = arr.length;
        find(arr, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int medium = arr[n / 2];
        System.out.println("the mediun is " + medium);

    }
}
