package examples.easy;

/**
 * https://leetcode.com/problems/arranging-coins/description/
 */
public class ProblemNumber441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        long answer = 0;

        while(low <= high) {
            long mid = low + (high - low) / 2;
            long coinsNeeded = mid*(mid+1)/2;
            if(coinsNeeded <= n) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)answer;
    }
}
