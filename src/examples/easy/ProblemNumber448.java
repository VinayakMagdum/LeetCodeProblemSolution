package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class ProblemNumber448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[] {1,1}));

        System.out.println(findDisappearedNumbers2(new int[] {4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers2(new int[] {1,1}));
    }

    /**
     * TC - O(n)
     * SC - O(n)
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        Arrays.fill(arr, 0);

        for(int num : nums) {
            arr[num] = 1;
        }
        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) ans.add(i);
        }

        return ans;

    }

    /**
     * TC - O(n)
     * SC - O(1)
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;

    }
}
