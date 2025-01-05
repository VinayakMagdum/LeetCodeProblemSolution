package examples.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
 */
public class ProblemNumber1239 {
    public static void main(String[] args) {
//        String[] strs = new String[] {"cha","r","act","ers"};
//        String[] strs = new String[] {"aa","bb"}; []
        String[] strs = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"};
        List<String> arr = Arrays.asList(strs);
        System.out.println(maxLength(arr));
    }

    public static int maxLength(List<String> arr) {
        return backtrack(0, arr, "");
    }

    private static int backtrack(int start, List<String> arr, String current) {
        int maxLength = current.length();

        for (int i = start; i < arr.size(); i++) {
            String nextStr = arr.get(i);
            if (isUnique(current + nextStr)) {
                maxLength = Math.max(maxLength, backtrack(i + 1, arr, current + nextStr));
            }
        }

        return maxLength;
    }

    private static boolean isUnique(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
