package examples.easy;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class ProblemNumber268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int tot = (n*(n+1))/2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return tot - sum;
    }
}
