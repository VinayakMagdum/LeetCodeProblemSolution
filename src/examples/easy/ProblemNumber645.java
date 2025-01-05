package examples.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/set-mismatch/
 */
public class ProblemNumber645 {
    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,3,4,6,5};
//        int[] nums = new int[]{1,2,2,4};
        int[] nums = new int[]{1,1};
        int[] ans = findErrorNums(nums);
        for (int num : ans)
            System.out.print(num + ", ");
    }

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
                break;
            }
        }
        int len = nums.length;
        int expSum = len*(len+1) / 2;
        int actSum = Arrays.stream(nums).sum();
        int missingNum = expSum - actSum + duplicate;
        int[] ans = new int[2];
        ans[0] = duplicate;
        ans[1] = missingNum;

        return ans;
    }
}
