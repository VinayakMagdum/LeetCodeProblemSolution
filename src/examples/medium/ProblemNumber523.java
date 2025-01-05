package examples.medium;

/**
 * https://leetcode.com/problems/continuous-subarray-sum/
 */
public class ProblemNumber523 {
    public static void main(String[] args) {

    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int tot = 0;
        for (int num : nums) {
            tot += num;
        }
        if (tot % k == 0) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            tot = 0;
            for (int j = i; j < nums.length; j++) {
                tot += nums[j];
                if (tot == k) {
                    return true;
                } else if (tot > k) {
                    break;
                }
            }
        }
        return false;
    }
}
