package examples.easy;

/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/
 */
public class ProblemNumber1800 {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[] {10,20,30,5,10,50}));
        System.out.println(maxAscendingSum(new int[] {10,20,30,40,50}));
        System.out.println(maxAscendingSum(new int[] {12,17,15,13,10,11,12}));
    }

    /**
     * TC = O(n)
     * SC = O(1)
     * @param nums
     * @return
     */
    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            while(i < nums.length -1 && (nums[i] < nums[i+1])) {
                sum += nums[i+1];
                i++;
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
