package SHEET_02;

public class Q18_SubsetOfSet {
    public static void find(int arr[]) {
        if (arr.length >= 0) {
            System.out.println("[]");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        find(arr);
    }
}
