package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
 */
public class ProblemNumber1913 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
//        Arrays.sort(nums);
//        int len = nums.length;
//        return (nums[len-1] * nums[len-2]) - (nums[0] * nums[1]);

        int firstBig = 0, secBig = 0;
        int firstSmall = Integer.MAX_VALUE, secSmall = Integer.MAX_VALUE;
        for (int num : nums) {
            if(num > firstBig) {
                secBig = firstBig;
                firstBig = num;
            } else {
                secBig = Integer.max(num, secBig);
            }

            if(num < firstSmall) {
                secSmall = firstSmall;
                firstSmall = num;
            } else {
                secSmall = Math.min(num, secSmall);
            }
        }

        return (firstBig*secBig) - (firstSmall*secSmall);
    }
}
