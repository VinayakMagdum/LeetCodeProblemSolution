package examples.easy;

/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 */
public class ProblemNumber1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
    }

    public static int countOdds(int low, int high) {
        if(low % 2 == 0 && high % 2 ==0) {
            return (high-low)/2;
        } else {
            return (high - low)/2 + 1;
        }
    }
}

