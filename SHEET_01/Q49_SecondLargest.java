package SHEET_01;

public class Q49_SecondLargest {
    public static void check(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
    public static void main(String[] args) {
        int arr[] = { 1,6,3,7,2};
        check(arr);
    }
}
