package examples.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/">...</a>
 */
public class ProblemNumber1456 {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
    }

    public static int maxVowels(String s, int k) {
        int ans = 0;
        int windowSum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                windowSum++;
            }

            if (i >= k) {
                char ch2 = s.charAt(i - k);
                if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                    windowSum--;
                }
            }

            ans = Math.max(windowSum, ans);
        }

        return ans;
    }
}
