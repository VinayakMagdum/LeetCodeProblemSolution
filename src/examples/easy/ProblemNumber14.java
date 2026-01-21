package examples.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">Problem No. 14</a>
 */
public class ProblemNumber14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flight","flow"})); // output - "fl"
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"})); // output - ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i< strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) return "";
        }

        return prefix;


//        String word = strs[0];
//        List<String> list = new ArrayList<>();
//        for(int i = 0; i < word.length(); i++) {
//            list.add(word.substring(0, word.length() - i));
//        }
//
//        for (String seq : list) {
//            boolean found = true;
//            for(int i = 1; i< strs.length && found; i++) {
//                if (!strs[i].startsWith(seq)) {
//                    found = false;
//                }
//            }
//            if(found) return seq;
//        }
//        return "";
    }
}

