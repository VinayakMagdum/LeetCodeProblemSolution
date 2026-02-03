package examples.medium;

/**
 * https://leetcode.com/problems/subarray-product-less-than-k/description/
 */
public class ProblemNumber713 {
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
        System.out.println(numSubarrayProductLessThanK(new int[] {10,4,2,6}, 100));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int windowProduct = 1;
        int ans = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            windowProduct *= nums[right];
            while (windowProduct >= k) {
                windowProduct /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}
