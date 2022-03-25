package examples.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern/
 */
public class ProblemNumber290 {

    public static void main(String[] args) {
//        String pattern = "abba", s = "dog cat cat fish";

        String pattern = "abba", s = "dog dog dog dog";

        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        char[] chars = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();
        if(strs.length != chars.length) {
            return false;
        }

        for (int i =0; i< chars.length; i++) {
            if(map.containsKey(chars[i]) && !map.get(chars[i]).equals(strs[i])) {
                return false;
            }
            if(!map.containsKey(chars[i]) && map.containsValue(strs[i])) {
                return false;
            }
            map.put(chars[i], strs[i]);
        }
        return true;
    }
}
