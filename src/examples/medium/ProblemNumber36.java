package examples.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ProblemNumber36 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(!(set.add("row" + i + board[i][j])) || !(set.add("col" + j + board[i][j]))) {
                        return false;
                    }
                    //Finding box number. Formula is (row/3)*3 + (j/3)
                    if(!(set.add("box" + ((i/3)*3+(j/3)) + board[i][j]))) {
                        return false;
                    }
                }
            }
        }


        return true;
    }
}
