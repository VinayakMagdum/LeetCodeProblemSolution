package examples.medium;

/**
 * https://leetcode.com/problems/spiral-matrix-ii/
 */
public class ProblemNumber59 {

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(4);
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1;
        int up = 0, down = n-1;
        int deltaI = 0, deltaJ = 1;
        int i = 0, j = 0;
        int count = 1;

        while(left <= right && up <= down) {

            if(j > right) {
                deltaI = 1;
                deltaJ = 0;
                j =right;
                up++;

            } else if( j < left) {
                deltaI = -1;
                deltaJ = 0;
                j = left;
                down--;

            } else if( i > down) {
                deltaI = 0;
                deltaJ = -1;
                i = down;
                right--;

            } else if(i < up) {
                deltaI = 0;
                deltaJ = 1;
                i = up;
                left++;

            } else {
                matrix[i][j] = count;
                count++;
            }

            i += deltaI;
            j += deltaJ;
        }

        return matrix;
    }
}
