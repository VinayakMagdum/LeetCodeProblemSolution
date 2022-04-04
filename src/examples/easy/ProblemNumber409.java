package examples.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class ProblemNumber409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aa"));
    }


//    /**
//     * Solution1
//     * @param s
//     * @return
//     */
//    private static int longestPalindrome(String s) {
//        HashSet<Character> set = new HashSet<>();
//        int res = 0;
//        for (char c : s.toCharArray()) {
//            if (set.contains(c)) {
//                res += 2;
//                set.remove(c);
//            } else {
//                set.add(c);
//            }
//        }
//
//        if (!set.isEmpty()) {
//            res++;
//        }
//        return res;
//    }

    /**
     * Solution 2
     * @param s
     * @return
     */
    private static int longestPalindrome(String s) {
        char[] c = s.toCharArray();
        int retVal = 0;
        Arrays.sort(c);

        if(c.length == 1)
            return 1;

        for(int i = 0; i < c.length - 1; i++)
        {
            if(c[i] == c[i+1])
            {
                retVal += 2;
                i += 1;
            }
        }

        if(retVal < c.length)
            retVal += 1;

        return retVal;
    }

}
