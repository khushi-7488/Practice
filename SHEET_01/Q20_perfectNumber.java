package SHEET_01;

public class Q20_perfectNumber {
    public static void check(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        if(sum == n){
            System.out.println(n + " is perfect square");
        }else{
            System.out.println(" not perfect square");
        }
        
    }

    public static void main(String[] args) {
        int n = 28;
       check(n);

    }
}
