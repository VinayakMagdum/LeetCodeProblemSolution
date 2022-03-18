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

//        Arrays.asList(nums);
//        List list = new ArrayList<>(Arrays.asList(nums));
//        if(list.contains(target))
//            System.out.println(list.indexOf(target));
//        else System.out.println(-1);
//        Arrays.binarySearch(nums, target);




        ProblemNumber27 obj = new ProblemNumber27();
        int[] arr = {0,1,2,2,3,0,4,2};
    int val = 2;
//        int[] arr = {3, 2 , 2, 3};
//        int val = 3;

        System.out.println(obj.removeElement(arr, val));
    }

    public int removeElement(int[] nums, int val) {
//        if(nums.length < 1) return 0;
//        int result = nums.length;
//        int index = 0;
//        int[] temp = new int[nums.length];
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == val) result--;
//            else {
//                temp[index] = nums[i];
//                index++;
//            }
//        }
//        nums = temp;
//        System.out.println(Arrays.toString(nums));
//        return result;



        int start = 0, end = nums.length -1;
        while (start <= end) {
            if (nums[start] != val) {
                start ++;
                continue;
            }
            if (nums[end] == val) {
                end --;
                continue;
            }
            nums[start] = nums[end];
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(nums));
        return start;
    }
    public int search(int[] nums, int target) {
        Arrays.asList(nums);
        List list = new ArrayList<>(Arrays.asList(nums));
        if(list.contains(target))
            return list.indexOf(target);
        else return -1;
    }
}
