package SHEET_02;

import java.util.Stack;

public class Q14_BalancedBracket {
    public static boolean find(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && s.pop() != '(') || (ch == '}' && s.pop() != '{') || (ch == ']' && s.pop() != '[')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})";
        System.out.println(find(str));
    }
}
