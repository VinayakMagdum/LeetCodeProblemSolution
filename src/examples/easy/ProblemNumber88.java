package examples.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description">Problem Link</a>
 */
public class ProblemNumber88 {
    public static void main(String[] args) {
        merge(new int[]{1,2,3, 0,0,0}, 3, new int[] {2,5,6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Tracker = m-1;
        int num2Tracker = n-1;
        int totLenTracker = m + n - 1;

        while (num2Tracker >= 0) {
            if (num1Tracker >= 0 && nums1[num1Tracker] > nums2[num2Tracker]) {
                nums1[totLenTracker--] = nums1[num1Tracker--];
            } else {
                nums1[totLenTracker--] = nums2[num2Tracker--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
