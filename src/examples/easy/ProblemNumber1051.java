package examples.easy;

import java.util.Arrays;

/**
 *
 */
public class ProblemNumber1051 {
    public static void main(String[] args) {
        int[] heights = new int[] {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(temp);
        int ans = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i]) {
                ans++;
            }
        }

        return ans;
    }
}
