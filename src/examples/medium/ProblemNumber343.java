package examples.medium;

/**
 * https://leetcode.com/problems/integer-break/
 */
public class ProblemNumber343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int[] dp = new int[n + 1];

        // Set base cases
        for (int i = 1; i <= 3; i++) {
            dp[i] = i;
        }

        for (int num = 4; num <= n; num++) {
            int ans = num;
            for (int i = 2; i < num; i++) {
                ans = Math.max(ans, i * dp[num - i]);
            }

            dp[num] = ans;
        }

        return dp[n];
    }
}
