package examples;

//Given an array of integers nums,
// return the length of the longest consecutive elements sequence.

//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//
//Input: nums = [1,2,3,13, 100,8,9,10,11,12]
//Output: 6. [8,9,10,11,12, 13]
//
//Input  nums = [1,2,3,3,3,4]
//Output: 6
//
//Input nums = [1,1,2,3,4,4]
//Output: 4

import java.util.Arrays;
public class FreshWorks {
    public int getConsecutiveCount(int[] arr) {
        Arrays.sort(arr);
        int res = 0;
        int temp = 1;
        for(int i = 0; i < arr.length -1; i++) {
            if(arr[i] == arr[i+1] || arr[i] == arr[i+1] -1) {
                temp++;
            } else {
                if(res < temp) {
                    res = temp;
                    temp = 1;
                }
            }
        }
        return res;
    }

}
