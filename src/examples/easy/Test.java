package examples.easy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
//                {9,1,7},
//                {8,9,2},
//                {3,4,6}
                {1,3},
                {2,2}
        };

//        System.out.println(findMissingAndRepeatedValues(grid));

//        int[] arr = new int[]{4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11};
//        System.out.println(divideArray(arr, 14));

        int[] arr = new int[]{1,2,6,4};
        System.out.println(maxFrequencyScore(arr, 3));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] arr = new int[n*n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                ++arr[grid[i][j]-1];
            }
        }

        for(int i = 0; i < n*n; i++) {
            if(arr[i] == 2) {
                ans[0] = i+1;
            }
            if(arr[i] == 0) {
                ans[1] = i+1;
            }
        }

        return ans;
    }

    public static int[][] divideArray(int[] nums, int k) {
        int numOfSubArr = nums.length / 3;
        int[][] ans = new int[numOfSubArr][3];

        Arrays.sort(nums);
        int i = 0;
        int tracker = 0;
        while (i < nums.length) {
            int temp = 0;
            int [] subArr = new int[3];
            while (temp < 3){

                subArr[temp] = nums[i];
                i++;
                temp++;
            }
            if((subArr[2] - subArr[1] > k) || (subArr[2] - subArr[0] > k) ) {
                return new int[][]{};
            }
            ans[tracker++] = subArr;
        }
        return ans;
    }

    public static int maxFrequencyScore(int[] nums, long k) {
//        Arrays.sort(nums);
//
//        int n = nums.length;
//        int left = 0;
//        int right = 0;
//        int maxCount = 0;
//
//        while (right < n) {
//            int cost = (nums[right] - nums[left]) * (right - left);
//
//            if (cost <= k) {
//                k -= cost;
//                maxCount = Math.max(maxCount, right - left + 1);
//                right++;
//            } else {
//                left++;
//            }
//        }
//
//        return maxCount;

        Arrays.sort(nums);

        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        // Calculate prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int left = 0;
        int right = 0;
        int maxCount = 0;

        while (right < n) {
            int cost = (nums[right] * (right - left)) - (prefixSum[right] - (left > 0 ? prefixSum[left - 1] : 0));

            if (cost <= k) {
                k -= cost;
                maxCount = Math.max(maxCount, right - left + 1);
                right++;
            } else {
                left++;
            }
        }

        return maxCount;
    }
}
