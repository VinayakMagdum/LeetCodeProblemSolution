package examples.easy;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-strings/
 */
public class ProblemNumber415 {

    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }

    private static String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.add(b);
        return String.valueOf(c);
    }
}
