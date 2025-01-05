package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-odd-binary-number/
 */
public class ProblemNumber2864 {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("010010101"));
    }

    public static String maximumOddBinaryNumber(String s) {
        int[] chars = new int[s.length()];
        Arrays.fill(chars, 0);
        boolean foundFirst = true;
        int index = 0;
        for(char ch : s.toCharArray()) {
            if(foundFirst && ch == '1') {
                chars[chars.length - 1] = 1;
                foundFirst = false;
            } else if (ch == '1') {
                chars[index] = 1;
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : chars) {
            sb.append(num);
        }
        return sb.toString();
    }
}
