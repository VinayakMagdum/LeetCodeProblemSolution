package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
 */
public class ProblemNumber2244 {
    public static void main(String[] args) {
        int[] tasks = new int[]{2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] tasks) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0)+1);
        }

        for (int freq : map.values()) {
            if(freq <= 1) {
                return -1;
            } else {
                ans += (freq+2)/3;
            }
        }

        return ans;
    }
}
