package examples.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */
public class ProblemNumber150 {
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(String token : tokens) {
            switch (token) {
                case "+":
                    queue.push(queue.pop() + queue.pop());
                    break;
                case "-":
                    queue.push(-queue.pop() + queue.pop());
                    break;
                case "*":
                    queue.push(queue.pop() * queue.pop());
                    break;
                case "/":
                    final int b = queue.pop();
                    final int a = queue.pop();
                    queue.push(a / b);
                    break;
                default:
                    queue.push(Integer.parseInt(token));
            }
        }

        return queue.peek();
    }
}
