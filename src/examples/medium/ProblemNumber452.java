package examples.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class ProblemNumber452 {
    public static void main(String[] args) {
        int[][] points = new int[][] {
//                {10,16},{2,8},{1,6},{7,12}
                {3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}
        };

        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        int ans = 1;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
//        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        int arrowX = points[0][1];
        for(int i = 1; i < points.length; ++i) {
            if(points[i][0] > arrowX) {
                arrowX = points[i][1];
                ++ans;
            }
        }
        return ans;

    }
}
