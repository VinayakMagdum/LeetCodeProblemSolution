package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/gas-station/
 */
public class ProblemNumber134 {
    public static void main(String[] args) {
        int[] gas = new int[]{1,2,3,4,5}, cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gases = Arrays.stream(gas).sum();
        int costs = Arrays.stream(cost).sum();
        if (gases - costs < 0)
            return -1;

        int ans = 0;
        int sum = 0;
        for(int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}
