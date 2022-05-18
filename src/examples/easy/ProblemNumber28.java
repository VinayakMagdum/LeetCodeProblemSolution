package examples.easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ProblemNumber28 {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }
}
