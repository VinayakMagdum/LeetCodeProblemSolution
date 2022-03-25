package examples.medium;

/**
 * https://leetcode.com/problems/rotate-image/
 */
public class ProblemNumber48 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
//        int[][] matrix = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        System.out.println("Before rotation : ");
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
        rotate(matrix);
        System.out.println("After rotation : ");
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        if(matrix.length < 2) {
            return;
        }

        int rows = matrix.length, columns = matrix[0].length;

        for (int i = 0; i < (rows+1)/2; i++) {
            for (int j = 0; j < columns/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[rows - j - 1][i];
                matrix[rows - j - 1][i] = matrix[rows - i - 1][columns - j - 1];
                matrix[rows - i - 1][columns - j - 1] = matrix[j][columns - i - 1];
                matrix[j][columns - i - 1] = tmp;
            }
        }
    }
}
