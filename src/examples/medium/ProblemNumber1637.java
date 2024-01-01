package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class ProblemNumber1637 {
    public static void main(String[] args) {
        int[][] points = new int[][] {
//                {8,7},{9,9},{7,4},{9,7}
                {3,1},{9,0},{1,0},{1,4},{5,3},{8,8}
        };
        System.out.println(maxWidthOfVerticalArea(points));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        int len = points.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 1; i < len; i++) {
            ans = Math.max(ans, (arr[i] - arr[i-1]));
        }
        return ans;
    }
}
