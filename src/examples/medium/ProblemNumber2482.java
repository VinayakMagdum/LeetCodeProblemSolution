package examples.medium;

/**
 * https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
 */
public class ProblemNumber2482 {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
//                {0,1,1},
//                {1,0,1},
//                {0,0,1}

                {1,1,1},
                {1,1,1}
        };
        System.out.println(onesMinusZeros(mat));
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int [] onesRow = new int[rows];
        int [] onesCol = new int[cols];
        int [] zeroRow = new int[rows];
        int [] zeroCol = new int[cols];
        int[][] ans = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            int onesCnt = 0;
            int zerosCnt = 0;
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    onesCnt++;
                } else {
                    zerosCnt++;
                }
            }
            onesRow[i] = onesCnt;
            zeroRow[i] = zerosCnt;
        }

        for(int i = 0; i < cols; i++) {
            int onesCnt = 0;
            int zerosCnt = 0;
            for (int j = 0; j < rows; j++) {
                if(grid[j][i] == 1) {
                    onesCnt++;
                } else {
                    zerosCnt++;
                }
            }
            onesCol[i] = onesCnt;
            zeroCol[i] = zerosCnt;
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                ans[i][j] = onesRow[i]+onesCol[j] - zeroRow[i] - zeroCol[j];
            }
        }
        return ans;
    }
}
