package examples.medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class ProblemNumber75 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0};
        sortColors(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sortColors(int[] nums) {
        int[] clrCnt = new int[3];
        for(int i =0; i< nums.length; i ++) {
            clrCnt[nums[i]] = clrCnt[nums[i]]+1;
        }

        int  j = 0;
        for (int i =0; i < clrCnt.length; i++) {
            while (clrCnt[i] > 0) {
                nums[j] = i;
                j++;
                clrCnt[i]--;
            }
        }
    }
}
