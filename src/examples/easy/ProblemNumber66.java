package examples.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/plus-one/description/">Problem Link</a>
 */
public class ProblemNumber66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int arrLen = digits.length;
        if (digits[arrLen-1] < 9) {
            digits[arrLen-1] = digits[arrLen-1] + 1;
            return digits;
        } else {
            int carrier = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + carrier > 9) {
                    digits[i] = 0;
                    carrier = 1;
                } else {
                    digits[i] = digits[i] + carrier;
                    carrier = 0;
                }
            }
            if (carrier == 1) {
                int[] resp = new int[digits.length+1];
                resp[0] = 1;
                for(int i = 1; i < resp.length; i++) {
                    resp[i] = digits[i-1];
                }
                return resp;
            }
        }

        return digits;
    }
}
