package examples.hard;

/**
 * https://leetcode.com/problems/minimum-cost-to-make-array-equal/
 */
public class ProblemNumber2448 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,2};
        int[] cost = new int[] {2,3,1,14};
        System.out.println(minCost(nums, cost));
    }

    public static long minCost(int[] nums, int[] cost) {
        // Initialize the left and the right boundary of the binary search.
        int left = 1000001, right = 0;
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }
        long answer = getCost(nums, cost, nums[0]);

        // As shown in the previous picture, if F(mid) > F(mid + 1), then the minimum
        // is to the right of mid, otherwise, the minimum is to the left of mid.
        while (left < right) {
            int mid = (right + left) / 2;
            long cost1 = getCost(nums, cost, mid);
            long cost2 = getCost(nums, cost, mid + 1);
            answer = Math.min(cost1, cost2);

            if (cost1 > cost2)
                left = mid + 1;
            else
                right = mid;
        }
        return answer;
    }

    private static long getCost(int[] nums, int[] cost, int base) {
        long result = 0L;
        for (int i = 0; i < nums.length; ++i)
            result += 1L * Math.abs(nums[i] - base) * cost[i];
        return result;
    }
}
