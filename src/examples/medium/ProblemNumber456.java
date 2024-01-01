package examples.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/132-pattern/
 */
public class ProblemNumber456 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,4,2};
        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ak = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] < ak) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i])
                ak = stack.pop();
            stack.push(nums[i]);
        }

        return false;
    }
}
