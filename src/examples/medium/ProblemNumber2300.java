package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
 */
public class ProblemNumber2300 {
    public static void main(String[] args) {
        int[] spells = new int[]{5,1,3};
        int[] potions = new int[] {1,2,3,4,5};
        int success = 7;

        System.out.println(successfulPairs(spells, potions, success));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; ++i)
            ans[i] = potions.length - firstIndexSuccess(spells[i], potions, success);

        return ans;
    }

    private static int firstIndexSuccess(int spell, int[] potions, long success) {
        int l = 0;
        int r = potions.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if ((long) spell * potions[m] >= success)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
}
