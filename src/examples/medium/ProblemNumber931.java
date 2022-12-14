package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-falling-path-sum/
 */
public class ProblemNumber931 {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int row = 1; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
                int min = Integer.MAX_VALUE;
                for(int k = Math.max(0, col-1); k < Math.min(cols, col+2); ++k) {
                    min = Math.min(min, matrix[row - 1][k]);
                }
                matrix[row][col] += min;
            }
        }
        return Arrays.stream(matrix[rows - 1]).min().getAsInt();
    }
}
