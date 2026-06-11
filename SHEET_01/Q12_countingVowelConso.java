package SHEET_01;

public class Q12_countingVowelConso {
    public static void find(String str) {
        int vow = 0;
        int conso = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vow++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                conso++;
            }
        }
        System.out.println("vowel is " + vow);
        System.out.println("consonent is " + conso);
    }

    public static void main(String[] args) {
        String str = "hello world";
        find(str);
    }
}
