package examples.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/string-compression-ii/
 */
public class ProblemNumber1531 {
    private static final int kMax = 101;
    private static int[][] dp;
    public static void main(String[] args) {
        System.out.println(getLengthOfOptimalCompression("aaabcccd", 2));
    }

    public static int getLengthOfOptimalCompression (String s, int k) {
        dp = new int[s.length()][k + 1];
        Arrays.stream(dp).forEach(A -> Arrays.fill(A, kMax));
        return compression(s, 0, k);
    }

    private static int compression(final String s, int i, int k) {
        if (k < 0)
            return kMax;
        if (i == s.length() || s.length() - i <= k)
            return 0;
        if (dp[i][k] != kMax)
            return dp[i][k];

        int maxFreq = 0;
        int[] count = new int[128];

        for (int j = i; j < s.length(); ++j) {
            maxFreq = Math.max(maxFreq, ++count[s.charAt(j)]);
            dp[i][k] = Math.min( //
                    dp[i][k],        //
                    getLength(maxFreq) + compression(s, j + 1, k - (j - i + 1 - maxFreq)));
        }
        return dp[i][k];
    }

    private static int getLength(int maxFreq) {
        if (maxFreq == 1)
            return 1; // c
        if (maxFreq < 10)
            return 2; // [1-9]c
        if (maxFreq < 100)
            return 3; // [1-9][0-9]c
        return 4;   // [1-9][0-9][0-9]c
    }

//    public static int getLengthOfOptimalCompression(String s, int k) {
//        if(s.length() == 1) {
//            return 1;
//        }
//        int ans = 0;
//        StringBuilder sb = new StringBuilder();
//        int tracker = 1;
//        for (int i = 1; i < s.length(); i++) {
//            if(s.charAt(i) == s.charAt(i-1)) {
//                if(i == s.length()-1) {
//                    ++tracker;
//                    sb.append("" + s.charAt(i-1) + (tracker));
//                }
//                ++tracker;
//            } else {
//                if(tracker <= 1)
//                    sb.append("" + s.charAt(i-1));
//                else
//                    sb.append("" + s.charAt(i-1) + (tracker));
//                if(i == s.length()-1) {
//                    sb.append("" + s.charAt(i));
//                }
//                tracker = 1;
//            }
//        }
//        System.out.println(sb);
//
//        return ans;
//    }
}
