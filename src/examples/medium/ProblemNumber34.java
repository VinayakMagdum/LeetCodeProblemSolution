package examples.medium;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class ProblemNumber34 {
    public static void main(String[] args) {
        int[] ans = searchRange(new int[]{5,7,7,8,8,10}, 8);
        for (int num : ans) {
            System.out.println(num);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = searchNum(nums, target);
        if (first == nums.length || nums[first] != target)
            return new int[] {-1, -1};
        int second = searchNum(nums, target + 1) - 1;
        return new int[] {first, second};
    }

    public static int searchNum(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (l+r) / 2;
            if(nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
