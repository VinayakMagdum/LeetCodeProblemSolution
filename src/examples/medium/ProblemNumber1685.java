package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
 */
public class ProblemNumber1685 {
    public static void main(String[] args) {
        int[] ans = getSumAbsoluteDifferences(new int[]{1,4,6,8,10});
        for (int num: ans) {
            System.out.print(num + ", ");
        }

    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int sum = 0;
        for (int num: ans) {
            sum+= num;
        }
        for (int i = 0; i < length; i++) {
            int num = (nums[i] * i) - sum - (nums[i] * (length-i-1));

//            for (int j = 0; j < length; j++) {
//                num += Math.abs(nums[i] - nums[j]);
//            }
            ans[i] = num;
        }
        return ans;
    }
}
