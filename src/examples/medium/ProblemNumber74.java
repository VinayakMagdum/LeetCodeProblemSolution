package examples.medium;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class ProblemNumber74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchMatrix(matrix, 16));
    }


    private static boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][cols-1]) {
                for(int j = 0; j < cols; j++) {
                    if(matrix[i][j] == target) return true;
                }
            }
        }

        return false;
    }
}
