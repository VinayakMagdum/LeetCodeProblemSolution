package examples.hard;

/**
 * https://leetcode.com/problems/unique-paths-iii/
 */
public class ProblemNumber980 {
    private int ans = 0;
    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {1,0,0,0},
            {0,0,0,0},
            {0,0,0,2}
        };
        ProblemNumber980 obj = new ProblemNumber980();
        System.out.println(obj.uniquePathsIII(grid));
    }

    public int uniquePathsIII(int[][] grid) {
        int totalEmpty =1;
        int startRowIdx = -1, startColIndex =-1, endRowIdx =-1, endColIdx=-1;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) {
                    ++totalEmpty;
                } else if(grid[i][j] == 1) {
                    startRowIdx = i;
                    startColIndex = j;
                } else if(grid[i][j] == 2) {
                    endRowIdx = i;
                    endColIdx = j;
                }
            }
        }
        dfs(grid, totalEmpty, startRowIdx, startColIndex, endRowIdx, endColIdx);
        return ans;
    }

    private void dfs(int[][] grid, int totEmptySpaces, int startRowIdx, int startColIndex,
                            int endRowIdx, int endColIdx) {
        if(startRowIdx < 0 || startRowIdx == grid.length
        || startColIndex < 0 || startColIndex == grid[0].length) {
            return;
        }
        if (grid[startRowIdx][startColIndex] < 0) {
            return;
        }
        if (startRowIdx == endRowIdx && startColIndex == endColIdx) {
            if(totEmptySpaces == 0) {
                ++ans;
            }
            return;
        }

        grid[startRowIdx][startColIndex] = -2;
        dfs(grid, totEmptySpaces - 1, startRowIdx + 1, startColIndex, endRowIdx, endColIdx);
        dfs(grid, totEmptySpaces - 1, startRowIdx - 1, startColIndex, endRowIdx, endColIdx);
        dfs(grid, totEmptySpaces - 1, startRowIdx, startColIndex + 1, endRowIdx, endColIdx);
        dfs(grid, totEmptySpaces - 1, startRowIdx, startColIndex - 1, endRowIdx, endColIdx);
        grid[startRowIdx][startColIndex] = 0;
    }
}
