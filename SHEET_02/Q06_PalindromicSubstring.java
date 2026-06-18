package SHEET_02;

public class Q06_PalindromicSubstring {
    public static void find(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(str.charAt(j2) +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        find("aaa");
    }
}
