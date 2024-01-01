package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class ProblemNumber1464 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
//        Arrays.sort(nums);
//        int len = nums.length;
//        return (nums[len-1]-1)* (nums[len-2]-1);

        int biggest = 0;
        int secBiggest = 0;

        for(int num : nums) {
            if(num > biggest) {
                secBiggest = biggest;
                biggest = num;
            }else {
                secBiggest = Math.max(secBiggest, num);
            }
        }

        return (biggest-1) * (secBiggest-1);
    }
}
