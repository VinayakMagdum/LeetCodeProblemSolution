package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class ProblemNumber905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    private static int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[i];
                nums[i] = temp;
                evenIndex++;
            }
        }
        return nums;
    }
}
