package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/reverse-only-letters/description/">Problem Link</a>
 */
public class ProblemNumber917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        int start = 0, end = s.length()-1;
        Character[] chars = new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        List<Character> charList = Arrays.asList(chars);

        char[] arr = s.toCharArray();

        while (start < end) {
            if (!charList.contains(s.charAt(start))) {
                start++;
            } else if (!charList.contains(s.charAt(end))) {
                end --;
            } else {
                char ch = s.charAt(start);
                arr[start] = arr[end];
                arr[end] = ch;
                start++;
                end --;
            }
        }
        return String.valueOf(arr);
    }
}
