package examples.easy;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
public class ProblemNumber703 {
    private static int k;
    PriorityQueue<Integer> heap;

    ProblemNumber703(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();

        for (int num : nums) {
            heap.add(num);
        }
        if (heap.size() > k) {
            heap.poll();
        }
    }

    private int add(int num) {
        heap.offer(num);
        if (heap.size() > k) {
            heap.poll();
        }
        System.out.println(heap.peek());
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 2};
        int k = 3;
        ProblemNumber703 kthLargest = new ProblemNumber703(k, arr);
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        kthLargest.add(4);   // return 8
    }
}
