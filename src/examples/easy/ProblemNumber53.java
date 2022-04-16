package examples.easy;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class ProblemNumber53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(currSum, max);
        }

        return max;
    }
}
