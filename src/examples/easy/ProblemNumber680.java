package examples.easy;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 */
public class ProblemNumber680 {

    public static void main(String[] args) {

        String s = "abca";
        System.out.println(validPalindrome(s));

    }

    private static boolean validPalindrome(String s) {
        int start = 0, end = s.length()-1;

        while (start < end - 1) {
            if (s.charAt(start) != s.charAt(end)) {
                if (valid(s, start, end - 1)) {
                    return true;
                }
                if (valid(s, start + 1, end)) {
                    return true;
                }
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    private static boolean valid(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
