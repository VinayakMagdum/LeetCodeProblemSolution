package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class ProblemNumber215 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr, 4));

    }

    private static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
