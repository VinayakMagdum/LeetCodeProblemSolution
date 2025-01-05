package examples.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class ProblemNumber349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if(!set.add(num)) {
                if(!list.contains(num))list.add(num);
            }
        }
        int[] ans = new int[list.size()];
        int idx=0;
        for (int num : list) {
            ans[idx++] = num;
        }
        return ans;
    }
}
