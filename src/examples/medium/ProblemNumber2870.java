package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
 */
public class ProblemNumber2870 {
    public static void main(String[] args) {
//        System.out.println(8/3);
//        System.out.println(minOperations(new int[] {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12}));
        System.out.println(minOperations(new int[] {2,3,3,2,2,4,2,3,4}));

    }

    public static int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num , 0) + 1);
        }
        for(int freq : map.values()) {
            if (freq == 1) {
                return -1;
            }
            int temp = freq/3;
            ans += freq % 3 == 0 ? temp : temp+1;
        }
        return ans;
    }
}
