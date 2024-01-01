package examples.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class ProblemNumber1160 {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","tb","hac","tree"}, "atach"));
    }

    public static int countCharacters(String[] words, String chars) {
        int ans = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int count[] = new int[26];
        for(final char c : chars.toCharArray()) {
            ++count[c - 'a'];
        }

        for (String str : words) {
            int[] temp = count.clone();
            for(Character ch : str.toCharArray()) {
                if(--temp[ch - 'a'] < 0) {
                    ans -= str.length();
                    break;
                }
            }
            ans += str.length();
        }

        return ans;
    }
}
