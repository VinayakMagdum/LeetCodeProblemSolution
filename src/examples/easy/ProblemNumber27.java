package examples.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/remove-element/
 *
 */
public class ProblemNumber27 {
    public static void main(String[] args) {
        ProblemNumber27 obj = new ProblemNumber27();
        int[] arr = {3,2,2,3};
        int val = 2;
//        int[] arr = {3, 2 , 2, 3};
//        int val = 3;
        System.out.println(obj.removeElement(arr, val));
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
