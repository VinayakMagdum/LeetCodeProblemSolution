package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-labels/
 */
public class ProblemNumber763 {

    public static void main(String[] args) {
        String str = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(str));
    }

    private static List<Integer> partitionLabels(String str) {
        int[] last = new int[26];
        for (int i = 0; i < str.length(); i++)
            last[str.charAt(i) - 'a'] = i;

        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            j = Math.max(j, last[str.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
