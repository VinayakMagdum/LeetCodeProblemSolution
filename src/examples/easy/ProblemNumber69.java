package examples.easy;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class ProblemNumber69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        if(x <= 0) return 0;
        int left = 1;
        int right = x;
        int res = 1;

        while(left < right) {
            int medium = (left + right) / 2;
            if(medium > x / medium) {
                right = medium;
            } else {
                res = medium;
                left = medium + 1;
            }
        }
        return res;
    }
}
