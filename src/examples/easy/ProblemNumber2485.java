package examples.easy;

/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 */
public class ProblemNumber2485 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int tot = n * (n+1) / 2;
        int lastSum = 0;
        while (n > 0) {
            lastSum += n;
            if (lastSum == (tot + n - lastSum)) {
                return n;
            }
            n--;
        }
        return -1;
    }
}
