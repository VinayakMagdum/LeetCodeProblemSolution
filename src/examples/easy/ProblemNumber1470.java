package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ProblemNumber1470 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2};
        int n = 2;
        System.out.println(Arrays.asList(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int l = 0, r = n;
        int i = 0;
        while(r < 2*n) {
            ans[i++] = nums[l++];
            ans[i++] = nums[r++];
        }
        return ans;
    }
}
