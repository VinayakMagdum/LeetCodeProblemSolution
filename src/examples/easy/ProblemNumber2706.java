package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/buy-two-chocolates/
 */
public class ProblemNumber2706 {
    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{1,2,2}, 3));
    }

    public static int buyChoco(int[] prices, int money) {
//        int ans = money;
//        Arrays.sort(prices);
//        int sumOfFirstTwoChocos = prices[0] + prices[1];
//        if(sumOfFirstTwoChocos <= money) {
//            ans = money - sumOfFirstTwoChocos;
//        }
//        return ans;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int price : prices) {
            if(price < firstMin) {
                secondMin = firstMin;
                firstMin = price;
            } else {
                secondMin = Math.min(secondMin, price);
            }
        }
        int tot = firstMin + secondMin;
        return money >= tot ? (money - tot) : money;
    }
}
