package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shifting-letters-ii/description/?envType=daily-question&envId=2025-01-05
 */
public class ProblemNumber2381 {
    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = new int[][]{
                {0,1,0},
                {1,2,1},
                {0,2,1}
        };
//        String s = "dztz";
//        int[][] shifts = new int[][]{
//                {0,0,0},
//                {1,1,1}
//        };
        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[][] shifts) {
        //Approach 1
//        int[] diff = new int[s.length()];
//        Arrays.fill(diff, 0);
//        for (int[] shift : shifts) {
//            int start = shift[0];
//            int end = shift[1];
//            int direction = shift[2] == 0 ? -1 : 1;
//            for (int i = start; i <= end; i++) {
//                diff[i] += direction;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            int count = diff[i] % 26;
//            if (count < 0)
//                count += 26;
//            char curr = (char) ((s.charAt(i) - 'a' + count) % 26 + 'a');
//            sb.append(curr);
//        }
//        return sb.toString();

        // Approach 2
        int[] diff = new int[s.length() + 1];
        Arrays.fill(diff, 0);
        for (int[] shift : shifts) {
            if (shift[2] == 1) {
                diff[shift[0]]++;
                diff[shift[1] + 1]--;
            } else {
                diff[shift[0]]--;
                diff[shift[1] + 1]++;
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            diff[i] += diff[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = diff[i] % 26;
            if (count < 0)
                count += 26;
            char curr = (char) ((s.charAt(i) - 'a' + count) % 26 + 'a');
            sb.append(curr);
        }
        return sb.toString();
    }
}
