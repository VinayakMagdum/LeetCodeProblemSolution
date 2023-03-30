package examples.medium;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
public class ProblemNumber540 {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2}));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int medium = (left + right) / 2;

            if( medium % 2 == 1) {
                --medium;
            }

            if(nums[medium] == nums[medium +1]) {
                left = medium + 2;
            } else {
                right = medium;
            }
        }

        return nums[left];
    }
}
