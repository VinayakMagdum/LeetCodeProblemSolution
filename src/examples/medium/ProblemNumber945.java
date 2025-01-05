package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-increment-to-make-array-unique/
 */
public class ProblemNumber945 {
    public static void main(String[] args) {
//        int[] nums = new int[] {3,2,1,2,1,7};
        int[] nums = new int[] {1,2,2};
        System.out.println(minIncrementForUnique(nums));
    }

    public static int minIncrementForUnique(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] >= nums[i]) {
                ans += (nums[i-1] + 1) - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}
