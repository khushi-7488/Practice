package SHEET_02;

import java.util.Arrays;

public class Q16_LongestConsecutiveSequence {
    public static int find(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int current = 1;
        int longest = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] == arr[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(current, longest);
                current = 1;
            }
        }
        return Math.max(longest, current);
    }

    public static void main(String[] args) {
        int arr[] = { 100, 3, 2, 200, 1, 4 };
        System.out.println(find(arr));
    }
}
