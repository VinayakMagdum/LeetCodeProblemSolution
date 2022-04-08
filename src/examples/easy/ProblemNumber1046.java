package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class ProblemNumber1046 {

    public static void main(String[] args) {
//        int[] stones = new int[] {2,7,4,1,8,1};
//        int[] stones = new int[] {1, 3};
//        int[] stones = new int[] {3, 3};
//        int[] stones = new int[] {10,4,2,10};
        int[] stones = new int[] {9,3,2,10};
        System.out.println(lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {
        int end = stones.length -1;
        Arrays.sort(stones);
        while (end != 0) {
            if(stones[stones.length-1]==stones[stones.length-2])
            {
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
            }
            if(stones[stones.length-1]!=stones[stones.length-2])
            {
                stones[stones.length-1]=stones[stones.length-1] - stones[stones.length-2];
                stones[stones.length-2]=0;
            }
            Arrays.sort(stones);
            end--;
        }

        for(int j: stones)
        {
            if(j!=0)
            {
                return j;
            }
        }
        return 0;

    }
}
