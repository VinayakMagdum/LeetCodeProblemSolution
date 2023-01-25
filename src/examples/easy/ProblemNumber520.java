package examples.easy;

/**
 * https://leetcode.com/problems/detect-capital/
 */
public class ProblemNumber520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("leetcode"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
