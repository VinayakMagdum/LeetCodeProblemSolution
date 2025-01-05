package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/
 */
public class ProblemNumber2971 {
    public static void main(String[] args) {
//        int[] nums = new int[] {1,12,1,2,5,50,3};
        int[] nums = new int[] {300005055,352368231,311935527,315829776,327065463,388851949,319541150,397875604,311309167,391897750,366860048,359976490,325522439,390648914,359891976,369105322,350430086,398592583,354559219,372400239,344759294,379931363,308829137,335032174,336962933,380797651,378305476,336617902,393487098,301391791,394314232,387440261,316040738,388074503,396614889,331609633,374723367,380418460,349845809,318514711,308782485,308291996,375362898,397542455,397628325,392446446,368662132,378781533,372327607,378737987};
//        int[] nums = new int[] {5,5,50};
        System.out.println(largestPerimeter(nums));
    }

    public static long largestPerimeter(int[] nums) {
        long total = 0;
        for(int num : nums) {
            total += num;
        }
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            if (total - nums[i] > nums[i]) {
                return total;
            } else {
                total -= nums[i];
            }
        }
        return -1;
    }
}
