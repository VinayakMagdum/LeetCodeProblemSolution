package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/
 */
public class ProblemNumber787 {
    public static void main(String[] args) {
        int n = 4, src = 0, dst = 3, k = 1;
        int[][]  flights = new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(findCheapestPrice(n, flights, src, dst, k));

    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[k+2][n];
        for(int i=0; i<=k+1; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        //fly from src to scr cost 0
        for(int i=0; i<=k+1; i++){
            dp[i][src] = 0;
        }

        for(int i=1; i<=k+1; i++){
            for(int[] f: flights){
                if(dp[i-1][f[0]]!=Integer.MAX_VALUE){
                    dp[i][f[1]] = Math.min(dp[i][f[1]],dp[i-1][f[0]]+f[2]);
                }
            }
        }
        return dp[k+1][dst] == Integer.MAX_VALUE ? -1 : dp[k+1][dst];
    }
}
