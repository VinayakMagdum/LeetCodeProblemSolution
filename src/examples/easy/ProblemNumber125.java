package examples.easy;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ProblemNumber125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    /**
     * TC --> O(n), SC --> O(1)
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        int left = 0; int right = s.length()-1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            }

            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right --;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
