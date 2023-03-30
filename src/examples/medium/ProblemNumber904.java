package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/fruit-into-baskets/
 */
public class ProblemNumber904 {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, right;

        for(right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) +1);

            if(basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0)
                    basket.remove(fruits[left]);
                left++;
            }
        }
        return right - left;
    }
}
