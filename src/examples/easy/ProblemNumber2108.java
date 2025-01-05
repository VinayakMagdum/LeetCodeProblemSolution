package examples.easy;

/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */
public class ProblemNumber2108 {
    public static void main(String[] args) {
        String[] words = new String[]{"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    private static String firstPalindrome(String[] words) {
        for (String str : words) {
            if (isPalindromic(str)) {
                return str;
            }
        }
        return "";
    }

    private static boolean isPalindromic(String str) {
        int start = 0;
        int end = str.length()-1;

        while(start <= end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
