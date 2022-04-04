package examples.easy;

import java.util.Collections;
import java.util.Stack;

public class ProblemNumber155 {
    private Stack<Integer> data;
    private Stack<Integer> mins;
    /** initialize your data structure here. */
    public ProblemNumber155() {
        data = new Stack<Integer>();
        mins = new Stack<Integer>();
        data.push(-1);
        mins.push(Integer.MAX_VALUE);
    }
    public void push(int x) {
        data.push(x);
        mins.push(Math.min(x, mins.peek()));
    }
    public void pop() {
        if (data.size() > 1) {
            data.pop();
            mins.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return mins.peek();
    }


    public static void main(String[] args) {
        ProblemNumber155 minStack = new ProblemNumber155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
