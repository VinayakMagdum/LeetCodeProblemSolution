package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-ice-cream-bars/
 */
public class ProblemNumber1833 {
    public static void main(String[] args) {
        int[] costs = new int[]{10,6,8,7,7,8};
        int coins = 5;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for(int i =  0; i < costs.length; i++) {
            if(coins >= costs[i]) {
                coins -= costs[i];
            } else {
                return i;
            }
        }
        return costs.length;
    }
}
