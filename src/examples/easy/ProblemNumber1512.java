package examples.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class ProblemNumber1512 {
    public static void main(String[] args) {
        int[] nums = new int[] {6,2,6,1,4,6,6,7};
        System.out.println(numIdenticalPairs2(nums));
    }

    // bruit force
    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            ans += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}
