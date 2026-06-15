package SHEET_01;

public class Q45_modeOfNumber {
    public static void find(int arr[]) {
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println(mode);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4 };
        find(arr);
    }
}
