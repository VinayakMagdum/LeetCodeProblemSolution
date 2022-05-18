package examples.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class ProblemNumber225 {
    Queue<Integer> q;
    public ProblemNumber225() {
        q = new LinkedList<Integer>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        if(!q.isEmpty()) {
            return q.poll();
        }
        return Integer.parseInt(null);
    }

    public int top() {
        if(!q.isEmpty()) {
            return q.peek();
        }
        return Integer.parseInt(null);
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
