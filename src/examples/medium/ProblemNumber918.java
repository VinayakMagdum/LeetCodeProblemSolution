package examples.medium;

/**
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
public class ProblemNumber918 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int a : nums) {
            totalSum += a;
            currMaxSum = Math.max(currMaxSum + a, a);
            currMinSum = Math.min(currMinSum + a, a);
            maxSum = Math.max(maxSum, currMaxSum);
            minSum = Math.min(minSum, currMinSum);
        }

        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
}
