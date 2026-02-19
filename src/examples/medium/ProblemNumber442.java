package examples.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */
public class ProblemNumber442 {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
        System.out.println(findDuplicates(new int[] {1,1,2}));
        System.out.println(findDuplicates(new int[] {2}));
        System.out.println(findDuplicates2(new int[] {4,3,2,7,8,2,3,1}));
        System.out.println(findDuplicates2(new int[] {1,1,2}));
        System.out.println(findDuplicates2(new int[] {2}));
    }

    /**
     * TC - O(n)
     * SC - O(n)
     * @param nums
     * @return
     */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if (entry.getValue() == 2) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    /**
     * TC - O(n)
     * SC - O(1)
     * @param nums
     * @return
     */
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length < 2) return ans;
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums [index] = -nums[index];
            }

        }
        return ans;
    }
}
