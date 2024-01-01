package examples.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ProblemNumber242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] chars = new int[26];
        for(char ch : s.toCharArray()) {
            ++chars[ch - 'a'];
        }
        for(char ch : t.toCharArray()) {
            if (chars[ch - 'a'] < 1) {
                return false;
            }
            --chars[ch - 'a'];
        }

        return true;
//        Map<Character, Integer> map = new HashMap<>();
//        for(char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : t.toCharArray()) {
//            if (map.containsKey(ch)) {
//                if (map.get(ch) > 0) {
//                    map.put(ch, map.get(ch) -1);
//                } else {
//                    return false;
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
    }
}
