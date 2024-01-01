package examples.easy;

/**
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 */
public class ProblemNumber1582 {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };
        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;

        int [] rowTracker = new int[row];
        int [] colTracker = new int[col];

        for(int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1) {
                    rowTracker[i]++;
                    colTracker[j]++;
                }
            }
        }

        for(int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1 && (rowTracker[i] ==1 && colTracker[j]==1)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
