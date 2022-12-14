package examples.easy;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ProblemNumber70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }


    public static int climbStairs(int n) {
        int prev = 1;
        int next = 1;
        for(int i = 2; i <=n; i++) {
            int temp = prev+next;
            next = prev;
            prev = temp;
        }
        return prev;
    }
}
