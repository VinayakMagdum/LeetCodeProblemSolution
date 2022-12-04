package examples.medium;

import java.util.Queue;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */
public class ProblemNumber378 {
    public static void main(String[] args) {
        int[] [] matrix = new int[][]{
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        System.out.println(kthSmallest(matrix, 8));
    }


    public static int kthSmallest(int[][] matrix, int k) {
        Queue<T> minHeap = new PriorityQueue<>((a, b) -> a.num - b.num);
        for (int i = 0; i < k && i < matrix.length; ++i)
            minHeap.offer(new T(i, 0, matrix[i][0]));

        while (k-- > 1) {
            final int i = minHeap.peek().i;
            final int j = minHeap.poll().j;
            if (j + 1 < matrix[0].length)
                minHeap.offer(new T(i, j + 1, matrix[i][j + 1]));
        }

        return minHeap.peek().num;
    }
}

class T {
    public int i;
    public int j;
    public int num;
    public T(int i, int j, int num) {
        this.i = i;
        this.j = j;
        this.num = num;
    }
}