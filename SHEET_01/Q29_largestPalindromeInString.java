package SHEET_01;

public class Q29_largestPalindromeInString {

    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindromes (e.g., "aba")
            int len1 = expandAroundCenter(s, i, i);

            // Case 2: Even length palindromes (e.g., "abba")
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get the maximum length found at this center
            int maxLen = Math.max(len1, len2);

            // If it's longer than our previous record, update boundaries
            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        // Return the final longest substring boundary
        return s.substring(start, end + 1);
    }


     // Helper method to expand outwards and count palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;  // Move left boundary outward
            right++; // Move right boundary outward
        }
        // Returns the length of the valid palindrome found
        return right - left - 1;
    }

    public static void main(String[] args) {
          String input = "babad";
        System.out.println("Longest Palindrome: " + findLongestPalindrome(input));
    }
}