package examples.easy;

import java.util.*;

public class ProblemNumber997 {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{
//                {1,3},
//                {2,3},
//                {3,1}
//        };

        int[][] arr = new int[][]{
                {1,2},
                {2,1}
        };

        System.out.println(findJudge(2, arr));

    }

    private static int findJudge(int n, int[][] trust) {
        int[] arr = new int[n];
        for(int i = 0; i < trust.length; i++) {
            int value = trust[i][0];
            int follow = trust[i][1];
            arr[follow-1]++;
            arr[value-1]--;
        }

        for(int idx = 0; idx < arr.length; idx++ ) {
            if(arr[idx] == n-1) {
                return idx+1;
            }
        }

        return -1;
    }
}
