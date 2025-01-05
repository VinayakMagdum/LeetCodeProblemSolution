package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/custom-sort-string/
 */
public class ProblemNumber791 {
    public static void main(String[] args) {
        System.out.println(customSortString("bcafg", "abcd"));
//        System.out.println(customSortString("kqep", "pekeq"));
    }

    public static String customSortString(String order, String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()) {
            list.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (list.contains(ch)) {
                sb.append(ch);
                list.remove(list.indexOf(ch));
            }
        }
        for (char ch : list) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
