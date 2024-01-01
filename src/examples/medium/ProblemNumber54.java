package examples.medium;

import java.util.List;
import java.util.ArrayList;

/**
 * https://leetcode.com/problems/spiral-matrix/
 */
public class ProblemNumber54 {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0)
            return ans;

        final int m = matrix.length;
        final int n = matrix[0].length;
        int r1 = 0;
        int c1 = 0;
        int r2 = m - 1;
        int c2 = n - 1;
        while (ans.size() < m * n) {
            for (int j = c1; j <= c2 && ans.size() < m * n; ++j)
                ans.add(matrix[c1][j]);

            for (int i = r1 + 1; i <= r2 - 1 && ans.size() < m * n; ++i)
                ans.add(matrix[i][c2]);

            for (int j = c2; j >= c1 && ans.size() < m * n; --j)
                ans.add(matrix[r2][j]);

            for (int i = r2 - 1; i >= r1 + 1 && ans.size() < m * n; --i)
                ans.add(matrix[i][c1]);
            ++r1;
            ++c1;
            --r2;
            --c2;
        }

        return ans;
    }
}
