package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class ProblemNumber438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[128];
        int required = p.length();

        for (final char c : p.toCharArray())
            ++count[c];

        for (int l = 0, r = 0; r < s.length(); ++r) {
            if (--count[s.charAt(r)] >= 0)
                --required;
            while (required == 0) {
                if (r - l + 1 == p.length())
                    ans.add(l);
                if (++count[s.charAt(l++)] > 0)
                    ++required;
            }
        }

        return ans;
    }


}
