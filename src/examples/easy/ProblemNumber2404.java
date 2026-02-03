package examples.easy;
import java.util.Map;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/most-frequent-even-element/description/
 */
public class ProblemNumber2404 {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[] {0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[] {29,47,21,41,13,37,25,7}));
        System.out.println(mostFrequentEven(new int[] {4,4,4,9,2,4}));
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int ans = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val == maxFreq) {
                ans = Math.min(key, ans);
            } else if (val > maxFreq) {
                ans = key;
                maxFreq = val;
            }
        }

        return ans;
    }
}
