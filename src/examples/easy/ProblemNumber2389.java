package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-subsequence-with-limited-sum/
 */
public class ProblemNumber2389 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,2,1}, queries = new int[]{3,10,21};

        answerQueries(nums, queries);
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int len = queries.length;
        int [] ans = new int[len];

        for(int i = 0; i< len; i++) {
            int sum=0;
            for(int j=0;j<nums.length;j++) {
                sum += nums[j];
                if(sum>queries[i]) {
                    ans[i]=j;
                    break;
                }

                if(j == nums.length-1 && sum<=queries[i])
                    ans[i]=j+1;
            }
        }

        return ans;
    }
}
