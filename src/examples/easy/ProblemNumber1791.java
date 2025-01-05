package examples.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-center-of-star-graph/
 */
public class ProblemNumber1791 {
    public static void main(String[] args) {
//        int[][] edges = new int[][]{
//                {1,2},{2,3},{4,2}
//        };
        int[][] edges = new int[][]{
                {1,2},{5,1},{1,3},{1,4}
        };
        System.out.println(findCenter(edges));
    }

    public static int findCenter(int[][] edges) {
        int[] edge1 = edges[0];
        int[] edge2 = edges[1];

        int x = edge1[0];
        int y = edge1[1];

        for (int edge : edge2) {
            if (x == edge || y == edge) {
                return edge == x ? x : y;
            }
        }

        return 0;
    }
}
