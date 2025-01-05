package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 */
public class ProblemNumber1347 {
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "practice"));
    }

    public static int minSteps(String s, String t) {
        int cnt = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[t.charAt(i) - 'a']++;
            arr[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            cnt += Math.max(0, arr[i]);
        }
        return cnt;
    }
}
