package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/
 */
public class ProblemNumber2825 {
    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("abc", "ad"));
        System.out.println(canMakeSubsequence("zc", "ad"));
        System.out.println(canMakeSubsequence("ab", "d"));
        System.out.println(canMakeSubsequence("ww", "x"));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int str1Index = 0, str2Index = 0;
        int lengthStr1 = str1.length(), lengthStr2 = str2.length();
        while (str1Index < lengthStr1 && str2Index < lengthStr2) {
            if (str1.charAt(str1Index) == str2.charAt(str2Index) || (getNextChar(str1.charAt(str1Index)) == str2.charAt(str2Index))) {
                str2Index++;
            }
            str1Index++;
        }
        return str2Index == lengthStr2;
    }

    private static char getNextChar (char ch) {
        if (ch == 'z') {
            return 'a';
        }
        int num = ch + 1;
        return (char) num;
    }
}
