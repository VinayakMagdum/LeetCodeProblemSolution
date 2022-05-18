package examples.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class ProblemNumber58 {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }
    private static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int lastIndex = i;

        while(i >= 0 && s.charAt(i) != ' ') {
            i--;
        }

        return lastIndex-i;
    }
}
