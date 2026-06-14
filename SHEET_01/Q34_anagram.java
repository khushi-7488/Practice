package SHEET_01;

import java.util.Arrays;

public class Q34_anagram {
    public static void check(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("not anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (!Arrays.equals(arr1, arr2)) {
            System.out.println("not anagram");
            return;
        }
        System.out.println("anagram");
    }

    public static void main(String[] args) {
        check("listen", "silent");
    }
}
