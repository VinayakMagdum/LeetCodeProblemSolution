package examples.medium;

public class ProblemNumber2270 {
    public static void main(String[] args) {
        System.out.println(-1 < -100);
//        int[] arr = new int[]{10,4,-8,7};0,0
//        int[] arr = new int[]{2,3,1,0};
        int[] arr = new int[]{0,0};
        System.out.println(waysToSplitArray(arr));
    }

    public static int waysToSplitArray(int[] nums) {
        int ans = 0;
        long tot = 0;
        for (int num : nums) {
            tot += num;
        }
        long partSum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            partSum += nums[i];
            if (partSum >= (tot - partSum)) {
                ans++;
            }
        }

        return ans;
    }
}
