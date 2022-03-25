package examples.medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 */
public class ProblemNumber334 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }

    private static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > mid) {
                return true;
            }

            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > min) {
                mid = nums[i];
            }
        }
        return false;
    }
}
