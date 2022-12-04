package examples.medium;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
 */
public class ProblemNumber1155 {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30, 30, 500));
    }

    //Brute force approach(Recursion)
//    public static int numRollsToTarget(int n, int k, int target) {
//        final int kMod = 1_000_000_007;
//        if(target < n || target > n*k) {
//            return 0;
//        }
//        if(n == 1) {
//            return target <= k ? 1 : 0;
//        }
//        int sum = 0;
//        for(int i = 1; i < target; i++) {
//            sum += numRollsToTarget(n-1, k, target-i);
//            sum %= kMod;
//        }
//        return sum;
//    }


    //Brute force approach(Recursion)
//    public static int numRollsToTarget(int n, int k, int target) {
//        HashMap<String, Integer> map = new HashMap<>();
//        final int kMod = 1_000_000_007;
//        if(target < n || target > n*k) {
//            return 0;
//        }
//        if(n == 1) {
//            return target <= k ? 1 : 0;
//        }
//        String key = "" + n + k + target;
//        int sum = 0;
//        if(!map.containsKey(key)) {
//            for(int i = 1; i < target; i++) {
//                sum += numRollsToTarget(n-1, k, target-i);
//                sum %= kMod;
//            }
//            map.put(key, sum);
//        }
//
//        return map.get(key);
//    }

    public static int numRollsToTarget(int n, int k, int target) {
        final int kMod = 1_000_000_007;
        int[] dp = new int[target + 1];
        dp[0] = 1;

        while (n-- > 0) { // N dices
            int[] newDp = new int[target + 1];
            for (int i = 1; i <= k; ++i)          // Number 1, 2, ..., k
                for (int t = i; t <= target; ++t) { // Possible targets
                    newDp[t] += dp[t - i];
                    newDp[t] %= kMod;
                }
            dp = newDp;
        }

        return dp[target];
    }
}
