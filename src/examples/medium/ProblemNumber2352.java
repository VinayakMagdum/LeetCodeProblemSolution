package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/equal-row-and-column-pairs/
 */
public class ProblemNumber2352 {
    public static void main(String[] args) {
//        int[][] grid = new int[][] {
//                {3,1,2,2},
//                {1,4,4,5},
//                {2,4,2,2},
//                {2,4,2,2}
//        };
        int[][] grid = new int[][] {
                {3,1,2,2},
                {1,4,4,4},
                {2,4,2,2},
                {2,5,2,2}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;

        for(int[] row : grid) {
            String str = Arrays.toString(row);
            map.put(str.toString(), map.getOrDefault(str.toString(), 0) + 1);
        }

        for(int i = 0; i < cols; i++) {
            int[] arr = new int[cols];
            for(int j = 0; j < rows; j++) {
                arr[j] = grid[j][i];
            }
            result += map.getOrDefault(Arrays.toString(arr), 0);
        }

        return result;
    }
}
