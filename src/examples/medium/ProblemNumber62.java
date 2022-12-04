package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public class ProblemNumber62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    /**
     *
     * @param m Number of Rows
     * @param n Number of Columns
     * @return
     */
    public static int uniquePaths(int m, int n) {
        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        for(int i = 1; i < m; ++i) {
            for(int j = 1; j < n; ++j) {
                dp[j] += dp[j-1];
            }
        }

        return dp[n - 1];
    }
}
