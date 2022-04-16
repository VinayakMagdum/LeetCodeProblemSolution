package examples.medium;

/**
 * https://leetcode.com/problems/game-of-life/
 * Solution -> https://www.youtube.com/watch?v=fei4bJQdBUQ
 */
public class ProblemNumber289 {

    public static void main(String[] args) {
        int [][] board = new int[][]{
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        gameOfLife2(board);
    }


    private static void gameOfLife2(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }


        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveCnts = 0;
                for (int k = 0; k < 8; k++) {
                    if(isSafe(i + dx[k], j + dy[k], rows, cols) && (copy[i+ dx[k]][j + dy[k]] == 1)) {
                        liveCnts++;
                    }
                }

                if(copy[i][j] == 0 && liveCnts == 3) {
                    board[i][j] = 1;
                }
                if(copy[i][j] == 1 && (liveCnts <2 || liveCnts > 3)) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isSafe(int i, int j, int rows, int cols) {
        return (i >= 0 && i < rows && j >=0 && j <  cols);
    }
}
