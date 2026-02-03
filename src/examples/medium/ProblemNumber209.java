package examples.medium;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class ProblemNumber209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (windowSum >= target) {
                ans = Math.min(ans, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }
        return ans > nums.length ? 0 : ans;
    }
}
