package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/koko-eating-bananas/
 */
public class ProblemNumber875 {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        while(l < r) {
            int m = (l + r) / 2;
            if(eatHrs(piles, m) <= h) {
                r = m;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    private static int eatHrs(int[] piles, int m) {
        return Arrays.stream(piles).reduce(
                0, (subTotal, pile) -> subTotal + (pile - 1) / m + 1);
    }
}
