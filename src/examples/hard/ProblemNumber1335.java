package examples.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
 */
public class ProblemNumber1335 {
    public static void main(String[] args) {
        System.out.println(minDifficulty(new int[]{6,5,4,3,2,1}, 2));
    }

    public static int minDifficulty(int[] jobDifficulty, int d) {
        int length = jobDifficulty.length;
        if (length < d) {
            return -1;
        }
        // dp[i][k] := the minimum difficulty to schedule the first i jobs in k days
        int[][] dp = new int[length+1][d+1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, Integer.MAX_VALUE / 2));
        dp[0][0] = 0;

        for (int i = 1; i <= length; ++i) {
            for (int k = 1; k <= d; ++k) {
                int maxDifficulty = 0;
                for (int j = i - 1; j >= k - 1; --j) {                         // 1-based
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[j]); // 0-based
                    dp[i][k] = Math.min(dp[i][k], dp[j][k - 1] + maxDifficulty);
                }
            }
        }

        return dp[length][d];
    }
}
