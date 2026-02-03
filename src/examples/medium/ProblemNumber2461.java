package examples.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
 */
public class ProblemNumber2461 {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[] {1,5,4,2,9,9,9}, 3));
        System.out.println(maximumSubarraySum(new int[] {1,1,1,7,8,9}, 3));
    }

    /**
     * TC - O(N^2)
     * @param nums
     * @param k
     * @return
     */
    public static long maximumSubarraySum(int[] nums, int k) {
        int windowSum = 0;
        long maxSum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];

            if (i >= k) {
                windowSum -= nums[i - k];
                freq.put(nums[i-k], freq.get(nums[i-k]) - 1);
                if (freq.get(nums[i-k]) == 0) {
                    freq.remove(nums[i-k]);
                }
            }

            if (i >= k - 1 && freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    /**
     * TC - O(N^2)
     * @param nums
     * @param k
     * @return
     */
    public static long maximumSubarraySum2(int[] nums, int k) {
        long ans = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            int tot = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                tot += nums[j];
                set.add(nums[j]);
            }
            if(set.size() == k) {
                ans = Math.max(ans, tot);
            }

        }

        return ans;
    }
}
