package examples.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/daily-temperatures/
 */
public class ProblemNumber739 {
    public static void main(String[] args) {
        int[] temp = new int[]{73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(temp);
        for (int num : ans)
            System.out.print(num + ",");

        }

//    public static int[] dailyTemperatures(int[] temperatures) {
//        int[] ans = new int[temperatures.length];
//
//        for (int i = 0; i < temperatures.length-1; i++) {
//            int val = 0;
//            for (int j = i+1; j < temperatures.length; j++) {
//                if(temperatures[i] < temperatures[j]) {
//                    val++;
//                    ans[i] = val;
//                    break;
//                } else {
//                    val++;
//                }
//            }
//        }
//
//        return ans;
//    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>(); // Decreasing stack

        for (int i = 0; i < temperatures.length; ++i) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                final int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }

        return ans;
    }
}
