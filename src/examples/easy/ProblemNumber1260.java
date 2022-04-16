package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/shift-2d-grid/
 */
public class ProblemNumber1260 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(shiftGrid(grid, 1));
    }

    private static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        int rows = grid.length,  cols = grid[0].length;

        //Fill the list
        for(int i = 0; i < rows; i++) {
            lists.add(new ArrayList<Integer>());
        }
        // total numbers in the grid
        int totNums = rows*cols;
        // new k value
        k = k%totNums;
        // starting from where we want to put element
        int start = totNums - k;
        int counterVar = 0;

        for(int i = start; i < start+totNums; i++) {
            //finding i^th and j^th value
            int r = (i/cols)%rows, c = i % cols;
            //Adding element into list.
            lists.get(counterVar/cols).add(grid[r][c]);
            counterVar++;
        }
        return lists;
    }
}
