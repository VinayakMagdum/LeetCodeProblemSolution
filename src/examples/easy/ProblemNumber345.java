package examples.easy;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ProblemNumber345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            while (start < end && !vowels.contains(""+sb.charAt(start))) {
                start++;
            }
            while (start < end && !vowels.contains(""+ sb.charAt(end))) {
                end--;
            }
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}
