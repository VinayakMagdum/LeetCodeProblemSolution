package examples.medium;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class ProblemNumber560 {

    public static void main(String args[]) {
        int[] nums = new int[]{1,2,3, 5, 7, 3, 1, 9, 1, 1};
        System.out.println(subArraySum(nums, 11));
    }

    private static int subArraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                count++;
            }
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
