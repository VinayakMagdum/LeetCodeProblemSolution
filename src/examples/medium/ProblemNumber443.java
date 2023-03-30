package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/string-compression/
 */
public class ProblemNumber443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    public static int compress(char[] chars) {
        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
    }
}
