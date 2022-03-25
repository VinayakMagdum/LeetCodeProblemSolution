package examples.medium;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 */
public class ProblemNumber240 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        System.out.println(searchMatrix(matrix, 13));
    }

//    /**
//     * Solution 1
//     * @param matrix
//     * @param target
//     * @return
//     */
//    private static boolean searchMatrix(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int expCols = 0;
//        for(int i = 0; i < cols; i++) {
//            if(matrix[0][i] <= target) {
//                expCols = i;
//            } else
//                break;
//        }
//        int expRows = 0;
//        for(int i = 0; i < rows; i++) {
//            if(matrix[i][0] <= target) {
//                expRows = i;
//            } else
//                break;
//        }
//
//        for(int i = 0; i <= expRows; i++) {
//            for(int j = 0; j <= expCols; j++) {
//                if(matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }



    /**
     * Solution 2
     * @param matrix
     * @param target
     * @return
     */
    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length-1;
        int cols = 0;
        while (rows >= 0 && cols < matrix[0].length) {
            if(matrix[rows][cols] > target) {
                rows--;
            } else if(matrix[rows][cols] < target) {
                cols++;
            } else {
                return true;
            }
        }
        return false;

    }
}
