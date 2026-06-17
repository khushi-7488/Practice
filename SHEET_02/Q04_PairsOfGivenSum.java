package SHEET_02;

public class Q04_PairsOfGivenSum {
    public static void find(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == key){
                    System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        find(arr, 5);
    }
}
