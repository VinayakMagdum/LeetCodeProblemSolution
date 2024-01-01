package examples.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 */
public class ProblemNumber844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#') {
                stack.add(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#') {
                stack2.add(t.charAt(i));
            } else {
                stack2.pop();
            }
        }
        if(stack.size() == stack2.size()) {
            while (!stack.isEmpty() && !stack2.isEmpty()) {
                if(stack.pop() != stack2.pop()) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
