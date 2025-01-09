package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/?envType=daily-question&envId=2025-01-06
 */
public class ProblemNumber1769 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("110")));
//        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public static int[] minOperations(String boxes) {
        int ans[] = new int[boxes.length()];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < boxes.length(); i++) {
            if(boxes.charAt(i) == '1') {
                list.add(i);
            }
        }

        for(int i = 0; i < boxes.length(); i++) {
            int tot = 0;
            for (int num : list) {
                tot += (Math.abs(i - num));
            }
            ans[i] = tot;
        }

        return ans;
    }
}
