package examples.easy;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ProblemNumber344 {
    public static void main(String[] args) {
        char[] s = new char[]{'H','a','n','n','a','h'};
        for (char c : s) {
            System.out.print(c + " ");
        }
        System.out.println();
        reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    private static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
