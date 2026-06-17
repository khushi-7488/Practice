package SHEET_02;

public class Q02_MultiplicationTable {
    public static void print(int start, int end) {

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= end; j++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        print(2, 4);
    }
}