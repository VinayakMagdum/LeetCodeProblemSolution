package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/kth-missing-positive-number/
 */
public class ProblemNumber1539 {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{5,6,7,8,9}, 9));

//        System.out.println(findKthPositive(new int[]{1,3,10}, 2));
    }

    public static int findKthPositive(int[] arr, int k) {
        if(arr[arr.length - 1]  == arr.length) {
            return arr[arr.length - 1] + k;
        } else if(arr[arr.length - 1]  - arr.length >= k) {
            List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
            int temp = 0;
            for(int i = 1; i < arr[arr.length - 1]; i++) {
                if(!nums.contains(i)) {
                    temp++;
                }
                if(temp == k) {
                    temp = i;
                    break;
                }
            }

            return temp;
        } else {
            return arr[arr.length - 1] + (k - (arr[arr.length - 1] - arr.length));
        }
//        List<Integer> list = new ArrayList<>();
//        int result = 0;
//        int tracker = 1;
//        for(int num : arr) {
//            while (tracker < num) {
////                list.add(tracker);
//                result++;
//                tracker++;
//            }
//            tracker++;
//            if(result == k) {
//                break;
//            }
//        }
//
//        if(result >= k) {
////            return list.get(k-1);
//            return result;
//        } else if(result == 0) {
//            return arr[arr.length - 1] + k;
//        } else {
//            return arr[arr.length - 1] + (k - result);
//        }
    }
}
