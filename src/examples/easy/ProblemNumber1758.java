package examples.easy;

/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
 */
public class ProblemNumber1758 {
    public static void main(String[] args) {
        System.out.println(minOperations("110010"));
    }

    public static int minOperations(String s) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0 && s.charAt(i) != '0') {
                ++first;
            }
            if(i % 2 != 0 && s.charAt(i) != '1') {
                ++first;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0 && s.charAt(i) != '1') {
                ++second;
            }
            if(i % 2 != 0 && s.charAt(i) != '0') {
                ++second;
            }
        }
        return Math.min(first, second);
    }
}
