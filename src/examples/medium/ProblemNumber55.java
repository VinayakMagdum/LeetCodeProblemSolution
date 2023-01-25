package examples.medium;

/**
 * https://leetcode.com/problems/jump-game/
 */
public class ProblemNumber55 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int i = 0;

        for (int reach = 0; i < nums.length && i <= reach; ++i)
            reach = Math.max(reach, i + nums[i]);

        return i == nums.length;
    }
}
