package SHEET_01;

public class Q46_LengthOfString {
    public static void find(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "helloworld";
        find(str);
    }
}
