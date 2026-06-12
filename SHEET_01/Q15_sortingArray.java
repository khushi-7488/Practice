package SHEET_01;

public class Q15_sortingArray {
    public static void find(int arr[], int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        find(arr, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 5, 2, 6 };
        find(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
