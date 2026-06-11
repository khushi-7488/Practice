// Finding the Greatest Common Divisor (GCD)
// Example:
// Input: a = 48, b = 18
// Output: 6
// Explanation: The GCD of 48 and 18 is 6

package SHEET_01;

public class Q10_gcd {

    public static int check(int a, int b) {
        if (b == 0) {
            return a;
        }
        return check(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(check(48, 12));
    }
}