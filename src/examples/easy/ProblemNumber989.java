package examples.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 */
public class ProblemNumber989 {
    public static void main(String[] args) {
        int[] nums = new int[]{9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(nums, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int len = num.length;
        int curr = k;
        int i = len;
        while (--i >= 0 || curr > 0) {
            if(i >= 0) {
                curr += num[i];
            }
            list.add(curr % 10);
            curr /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
