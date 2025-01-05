package examples.easy;

import java.util.Arrays;

/**
 *
 */
public class ProblemNumber205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        int first = 0;
        int second = 0;
        for(char ch : s.toCharArray()) {
            arr[ch - 'a'] = 1;
        }
        for(int num : arr) {
            first += num;
        }
        Arrays.fill(arr, 0);
        for(char ch : t.toCharArray()) {
            arr[ch - 'a'] = 1;
        }
        for(int num : arr) {
            second += num;
        }

        return first == second;
    }
}
