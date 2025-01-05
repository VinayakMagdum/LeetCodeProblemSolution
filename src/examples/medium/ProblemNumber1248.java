package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/count-number-of-nice-subarrays/
 */
public class ProblemNumber1248 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2,1,1};
        System.out.println(numberOfSubarrays(nums, 3));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int currSum = 0, subarrays = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(currSum, 1);

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i]%2;
            if (prefixSum.containsKey(currSum - k)) {
                subarrays = subarrays + prefixSum.get(currSum - k);
            }
            // Increment the current prefix sum in hashmap
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        }
        return subarrays;
    }
}
