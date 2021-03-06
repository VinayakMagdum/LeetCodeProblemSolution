package examples.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-duplicate-letters/
 */
public class ProblemNumber316 {

    public static void main(String[] args) {
        ProblemNumber316 obj = new ProblemNumber316();
        String str = "bcabc";
        System.out.println(obj.removeDuplicateLetters(str));
    }


    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<Character>();
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i ++) {
            count[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            count[c - 'a'] --;
            if (visited[c - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

}
