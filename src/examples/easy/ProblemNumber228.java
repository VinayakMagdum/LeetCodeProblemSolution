package examples.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * https://leetcode.com/problems/summary-ranges/
 */
public class ProblemNumber228 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++) {
            int start = nums[idx];
            while (idx < nums.length-1 && (nums[idx] + 1 == nums[idx+1])) {
                idx++;
            }
            String str;
            if(start != nums[idx]) {
                str = start + "->" + nums[idx];
            } else {
                str = start + "";
            }
            list.add(str);
        }

        return list;
    }
}
