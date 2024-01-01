package examples.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
 */
public class ProblemNumber1897 {
    public static void main(String[] args) {
        String[] words = new String[] {"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
//        Map<Character, Integer> map = new HashMap<>();
//        int length = words.length;
//        for (String word : words) {
//            for (char ch : word.toCharArray()) {
//                map.put(ch, map.getOrDefault(ch, 0) + 1);
//            }
//        }
//        for (int value : map.values()) {
//            if (value%length != 0)
//                return false;
//        }
//        return true;

        int length = words.length;
        int arr[] = new int[26];
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                ++arr[ch - 'a'];
            }
        }

        return Arrays.stream(arr).allMatch(freq -> freq % length == 0);
    }
}
