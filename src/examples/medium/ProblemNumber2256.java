package examples.medium;

/**
 * https://leetcode.com/problems/minimum-average-difference/
 */
public class ProblemNumber2256 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,3,9,5,3};

//
        System.out.println(minimumAverageDifference(arr));
    }

//    public static int minimumAverageDifference(int[] nums) {
//        int length = nums.length;
//        int index = 0;
//        int minAvg = Integer.MAX_VALUE;
//        for (int i = 0; i < length; i++) {
//            int firstSum = 0;
//            for (int j = 0; j <= i; j++){
//                firstSum += nums[j];
//            }
//
//            int next = i + 1;
//            int secondSum = 0;
//            for (int k = next; k < length; k++) {
//                secondSum += nums[k];
//            }
//
//            int avg;
//            if(i == length -1) {
//                avg = Math.abs(firstSum/(i+1));
//            } else {
//                avg = Math.abs(firstSum/(i+1) - secondSum/(length-next));
//            }
//            if(avg < minAvg) {
//                minAvg = avg;
//                index = i;
//            }
//        }
//
//        return index;
//    }

    public static int minimumAverageDifference(int[] nums) {
        int length = nums.length;
        int index = 0;
        int minAvg = Integer.MAX_VALUE;
        int firstSum = 0;
        int secondSum = 0;
        int tot = 0;
        for (int i = 0; i< length; i++) {
            tot += nums[i];
        }
        for (int i = 0; i < length; i++) {
            firstSum += nums[i];
            secondSum = tot - firstSum;
            int avg;
            if(i == length -1) {
                avg = Math.abs(firstSum/(i+1));
            } else {
                avg = Math.abs(firstSum/(i+1) - secondSum/(length - (i+1)));
            }
            if(avg < minAvg) {
                minAvg = avg;
                index = i;
            }
        }

        return index;
    }

    public int minimumAverageDifference2(int[] nums) {
        int len = nums.length, res = 0;
        long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
        for (int num : nums)
            sum += num;
        for (int i = 0; i < len; i++) {
            leftSum += nums[i];
            rightSum = sum - leftSum;
            long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len -i - 1)));
            if (diff < min) {
                min = diff;
                res = i;
            }
        }
        return res;
    }
}
