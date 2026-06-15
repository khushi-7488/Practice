package SHEET_01;

public class Q44_Average {
    public static int find(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i]);
        }
        return sum / n;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(find(arr));
    }
}
