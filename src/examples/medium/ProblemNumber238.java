package examples.medium;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProblemNumber238 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num+ " ");
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i ++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
        int tmp = 1;
        for (int i = nums.length - 2; i >= 0; i --) {
            result[i] = result[i] * (nums[i + 1] * tmp);
            tmp = nums[i + 1] * tmp;
        }
        return result;
    }
}
