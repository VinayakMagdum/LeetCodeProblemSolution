package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
 */
public class ProblemNumber2966 {
    public static void main(String[] args) {
        System.out.println("leetcode".indexOf('e'));
    }

    public int[][] divideArray(int[] nums, int k) {
        int numOfSubArr = nums.length / 3;
        int[][] ans = new int[numOfSubArr][3];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < 3; j++) {

            }
            i += 3;
        }

        return ans;
    }
}
