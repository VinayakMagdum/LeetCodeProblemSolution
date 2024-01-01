package examples.easy;

/**
 * https://leetcode.com/problems/calculate-money-in-leetcode-bank/
 */
public class ProblemNumber1716 {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }

    public static int totalMoney(int n) {
        int ans = 0;
        if(n <= 7) {
            return (n*(n+1)/2);
        }
        int num = 6;
        int divider = n / 7;
        int reminder = n % 7;
        for (int i = 1; i <= divider; i++) {
            ans += ((num+i)*(num+i+1)/2 - i*(i-1)/2);
        }
        for (int i = 1; i <= reminder; i++){
            ans += divider+i;
        }
        return ans;
    }
}
