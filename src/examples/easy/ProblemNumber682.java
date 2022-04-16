package examples.easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class ProblemNumber682 {

    public static void main(String[] args) {
        String[] ops = new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }

    /**
     * Using List
     *
     * @param ops
     * @return
     */
//    private static int calPoints(String[] ops) {
//        int result = 0;
//        int index = 0;
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//
//        while(i < ops.length) {
//            if(ops[i].equals("C")) {
//                result -= list.get(index-1);
//                list.remove(index-1);
//                index--;
//            } else if(ops[i].equals("D")) {
//                result += 2 * list.get(index-1);
//                list.add(index, 2 * list.get(index-1));
//                index++;
//            } else if(ops[i].equals("+")) {
//                result += list.get(index-1) + list.get(index-2);
//                list.add(index, list.get(index-1) + list.get(index-2));
//                index++;
//            } else {
//                result += Integer.parseInt(ops[i]);
//                list.add(Integer.parseInt(ops[i]));
//                index++;
//            }
//            i++;
//        }
//
//        return result;
//    }


    private static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("D")) {
                int x = stack.peek();
                sum += x + x;
                stack.push(2 * x);
            }
            else if(ops[i].equals("C")) {
                int x = stack.pop();
                sum -= x;
            }
            else if(ops[i].equals("+")) {
                int x = stack.peek() + stack.get(stack.size() - 2);
                sum += x;
                stack.push(x);
            }
            else {
                int x = Integer.parseInt(ops[i]);
                sum += x;
                stack.push(x);
            }
        }
        return sum;
    }
}
