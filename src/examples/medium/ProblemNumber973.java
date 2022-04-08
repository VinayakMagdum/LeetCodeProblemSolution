package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class ProblemNumber973 {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {3,3},
                {5,-1},
                {-2,4}
        };

        System.out.println(kClosest(matrix, 2));
    }

    private static int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[] distance = new int[n];
        for(int i = 0; i < n; i++)
        {
            int x = points[i][0], y = points[i][1];
            distance[i] = (x * x) + (y * y);
        }
        Arrays.sort(distance);

        int distk = distance[k - 1];

        int[][] res = new int[k][2];
        int index = 0;

        for(int i = 0; i < n; i++)
        {
            int x = points[i][0], y = points[i][1];
            int dist = (x * x) + (y * y);

            if (dist <= distk) {
                res[index][0] = x;
                res[index][1] = y;
                index++;
            }

        }
        return res;
    }
}
