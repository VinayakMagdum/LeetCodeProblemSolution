package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-01-04
 */
public class ProblemNumber1930 {
    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("adc"));
    }

    public static int countPalindromicSubsequence(String s) {
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.get(ch).remove(1);
                map.get(ch).add(1, i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(0, i);
                list.add(1, 0);
                map.put(ch, list);
            }
        }
        int ans = 0;

        for (char ch : map.keySet()) {
            int startIdx = map.get(ch).get(0);
            int endIdx = map.get(ch).get(1);
            if (endIdx != 0) {
                Set<Character> set = new HashSet<>();
                for (int i = startIdx+1; i < endIdx; i++) {
                    set.add(s.charAt(i));
                }
                ans += set.size();
            }
        }
        return ans;
    }

    private boolean isStringPalindrome(String s) {
        int start = 0, end = s.length();
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }
}
