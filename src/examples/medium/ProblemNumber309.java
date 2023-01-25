package examples.medium;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class ProblemNumber309 {
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        int prev = 0;
        for (final int price : prices) {
            final int cache = sell;
            sell = Math.max(sell, hold + price);
            hold = Math.max(hold, prev - price);
            prev = cache;
        }
        return sell;
    }
}
