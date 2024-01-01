package examples.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/
 */
public class ProblemNumber2009 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{41,33,29,33,35,26,47,24,18,28}));
    }

    public static int minOperations(int[] nums) {
//        if(isArrayContainsDuplicate(nums))
//            return 0;
        int duplicate = duplicateElementCnt(nums);
        int ans = 0;
        int len = nums.length;
        Arrays.sort(nums);
        int minNum = nums[0];
        int maxNum = len + minNum - 1;

        if (nums[len-1] < maxNum) {
            return 1;
        } else {
            for (int i = 1; i < len; i++) {
                if(nums[i] > maxNum) {
                    ans++;
                }
            }
            ans += duplicate;
        }

        return ans;
    }

    private static int duplicateElementCnt(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                ans++;
            }
        }

        return ans;
    }
}
