package SHEET_01;

public class Q13_reverse {
    public static void find(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "khushi";
        find(str);
    }
}
