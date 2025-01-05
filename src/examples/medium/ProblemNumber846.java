package examples.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/hand-of-straights/
 */
public class ProblemNumber846 {
    public static void main(String[] args) {
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : hand) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            Set<Integer> set = map.keySet();
            while (map.size() > 0) {
                // Get the smallest card value
                int current_card = map.entrySet().iterator().next().getKey();
                for (int i = 0; i < groupSize; i++) {
                    if (!map.containsKey(current_card + i)) return false;

                    map.put( current_card + i, map.get(current_card + i) - 1);
                    // Remove the card value if its occurrences are exhausted
                    if (map.get(current_card + i) == 0) map.remove(current_card + i );
                }
            }
        }
        return true;
    }

    private static boolean checkIfNumbersConsecutive(int[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (hand[i] != hand[i-1]+1) {
                return false;
            }
        }
        return true;
    }
}
