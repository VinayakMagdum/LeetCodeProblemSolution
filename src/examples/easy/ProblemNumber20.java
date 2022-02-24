package examples.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ProblemNumber20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Parentheses string: ");
        String str = sc.nextLine();

        ProblemNumber20 obj = new ProblemNumber20();
        System.out.println(obj.isValid(str));
    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        else {
            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                    continue;
                }
                if(stack.size() == 0 || map.get(s.charAt(i)) != stack.pop()) {
                    return false;
                }
            }
            if(stack.size() == 0)
                return true;
        }
        return false;
    }
}
