package SHEET_01;

public class Q14_largestSmallest {
    public static void find(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println("largest number is " + max);
        System.out.println("smallest number is " + min);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 5 };
        find(arr);
    }
}
