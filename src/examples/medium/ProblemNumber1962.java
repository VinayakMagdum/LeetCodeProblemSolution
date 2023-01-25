package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/remove-stones-to-minimize-the-total/
 */
public class ProblemNumber1962 {
    public static void main(String[] args) {
        int[] piles = new int[]{4,3,6,7};
//        int[] piles = new int[]{1};
//        System.out.println(7/2 + 7%2);
        System.out.println(minStoneSum(piles, 3));
    }

    public static int minStoneSum(int[] piles, int k) {
        Queue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1 < o2) {
                return 1;
            }else if (o1 > o2) {
                return -1;
            } else {
                return 0;
            }
        });

        for (int pile : piles) {
            heap.offer(pile);
        }

        while (k-- > 0){
            int stones = heap.poll();
            stones -= (int) (Math.floor (stones / 2));
            heap.offer(stones);
        }

        int sum = 0;
        while (!heap.isEmpty ())
            sum += heap.poll ();
        return sum;
    }

}
