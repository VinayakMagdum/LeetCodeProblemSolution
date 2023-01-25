package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/non-decreasing-subsequences/
 */
public class ProblemNumber491 {
    public static void main(String[] args) {
        List<List<Integer>> ans = findSubsequences(new int[]{4,6,7,7});
        System.out.println(ans);
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len-1; j++) {
                if(nums[i] <= nums[j]) {
                    List<Integer> list = new ArrayList<>();
                    for(int k = i; k <= j; k++) {
                        if(nums[k] <= nums[k+1]) {
                            list.add(nums[k]);
                        }
                    }
                    ans.add(list);
                }
            }
        }

        return ans;
    }
}
