package examples.medium;

import java.util.HashSet;
import java.util.Stack;

public class ProblemNumber1249 {

    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(str));
    }

    private static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch))
                continue;
            if(ch == '(') {
                stack.push(i);
            } else {
                if(!stack.isEmpty() &&  s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for(int i=0;i<s.length();i++) {
            if(!set.contains(i))
                result.append(s.charAt(i));
        }
        return result.toString();
    }
}
