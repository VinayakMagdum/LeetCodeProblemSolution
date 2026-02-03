package examples.easy;

import java.util.Scanner;

/**
 * Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class ProblemNumber26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i< size; i++) {
            nums[i] = sc.nextInt();
        }
        ProblemNumber26 obj = new ProblemNumber26();
        System.out.println(obj.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
