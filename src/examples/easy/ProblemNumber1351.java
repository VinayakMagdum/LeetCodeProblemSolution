package examples.easy;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class ProblemNumber1351 {
    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                if(grid[i][j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }


        return count;
    }
}
