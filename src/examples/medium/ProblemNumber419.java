package examples.medium;

/**
 * https://leetcode.com/problems/battleships-in-a-board/
 */
public class ProblemNumber419 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}
        };
        System.out.println(countBattleships(board));
    }

    private static int countBattleships(char[][] board) {
        int result = 0;
        int rows = board.length;
        int cols = board[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(board[i][j] == 'X' &&
                        (i == 0 || board[i-1][j] == '.') &&
                        (j == 0 || board[i][j-1] == '.')) {
                    result++;
                }
            }
        }

        return result;
    }
}
