package examples.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ProblemNumber1823 {

    public static void main(String args[]) {
        System.out.println(findTheWinner(6, 3));
    }

//    private static int findTheWinner(int n, int k) {
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= n; i++ ){
//            queue.add(i);
//        }
//
//        while (queue.size() != 1) {
//            for(int i = 0; i < k-1; i++) {
//                queue.add(queue.poll());
//            }
//            queue.poll(); // Remove k^th element
//        }
//
//        return queue.poll();
//    }

    private static int findTheWinner(int n, int k) {
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans = (ans + k) % i;
        }
        return ans+1;
    }
}
