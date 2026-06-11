// Finding the Least Common Multiple (LCM)
// Example:
// Input: a = 12, b = 15
// Output: 60
// Explanation: The LCM of 12 and 15 is 60.
package SHEET_01;

public class Q11_LCM {
    public static void find(int a, int b) {
        int maxLimit = a * b;
        for (int i = 1; i < maxLimit; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                return;
            }

        }
    }

    public static void main(String[] args) {
        find(12, 15);
    }
}
