package examples.medium;

/**
 * https://leetcode.com/problems/flip-string-to-monotone-increasing/
 */
public class ProblemNumber926 {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("010110"));
    }

    public static int minFlipsMonoIncr(String S) {
        int[] dp = new int[2];

        for (int i = 0; i < S.length(); ++i) {
            int temp = dp[0] + (S.charAt(i) == '1' ? 1 : 0);
            dp[1] = Math.min(dp[0], dp[1]) + (S.charAt(i) == '0' ? 1 : 0);
            dp[0] = temp;
        }

        return Math.min(dp[0], dp[1]);
    }
}
