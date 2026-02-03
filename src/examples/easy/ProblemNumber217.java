package examples.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 */
public class ProblemNumber217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
