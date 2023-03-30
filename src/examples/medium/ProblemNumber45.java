package examples.medium;

/**
 * https://leetcode.com/problems/jump-game-ii/
 */
public class ProblemNumber45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }

    public static int jump(int[] nums) {
        int answer = 0, n = nums.length;
        int curEnd = 0, curFar = 0;

        for (int i = 0; i < n - 1; ++i) {
            // Update the farthest reachable index of this jump.
            curFar = Math.max(curFar, i + nums[i]);

            // If we finish the starting range of this jump,
            // Move on to the starting range of the next jump.
            if (i == curEnd) {
                answer++;
                curEnd = curFar;
            }
        }

        return answer;
    }
}
