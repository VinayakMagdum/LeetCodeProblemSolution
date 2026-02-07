package examples.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */
public class ProblemNumber13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int length = s.length();
        int ans = getCharValue(s.charAt(length-1));

        for (int i = length-2; i >=0; i--) {
            int currVal = getCharValue(s.charAt(i));
            int nextVal = getCharValue(s.charAt(i+1));
            if (currVal < nextVal) {
                ans -= currVal;
            } else {
                ans += currVal;
            }
        }

        return ans;
    }

    private static int getCharValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
