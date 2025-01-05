package examples.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class ProblemNumber387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("dddccdbba"));
//        System.out.println("leetcode".substring(0, 0).indexOf('l'));
    }

    public static int firstUniqChar(String s) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for(char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for(char val : map.keySet()) {
//            if (map.get(val) == 1) {
//                return s.indexOf(val);
//            }
//        }
//        return -1;


        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); ++i) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
