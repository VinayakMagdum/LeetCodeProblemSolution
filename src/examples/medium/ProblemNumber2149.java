package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */
public class ProblemNumber2149 {
    public static void main(String[] args) {
        int[] positive = rearrangeArray(new int[] {3,1,-2,-5,2,-4});
        for (int num:  positive) {
            System.out.println(num);
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int positiveIdx = 0;
        int negativeIdx = 1;
        for(int num : nums) {
            if(num > 0) {
                ans[positiveIdx] = num;
                positiveIdx += 2;
            } else {
                ans[negativeIdx] = num;
                negativeIdx += 2;
            }
        }

        return ans;
    }
}
