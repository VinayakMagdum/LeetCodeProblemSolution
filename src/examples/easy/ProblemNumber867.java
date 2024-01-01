package examples.easy;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
public class ProblemNumber867 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result = transpose(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            int [] arr = new int[rows];
            for (int j = 0; j < rows; j++) {
                arr[j] = matrix[j][i];
            }
            ans[i] = arr;
        }

        return ans;
    }
}
