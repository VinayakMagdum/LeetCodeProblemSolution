package examples.easy;

/**
 * https://leetcode.com/problems/largest-odd-number-in-string/
 */
public class ProblemNumber1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4268"));
    }

    public static String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i--) {
            int number = num.charAt(i) - '1' + 1;
            if(number % 2 != 0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
