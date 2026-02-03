package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class ProblemNumber283 {
    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
    }

    /**
     * It is O(n) time, O(1) space
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (index != i ) nums[i] = 0;
                index ++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
