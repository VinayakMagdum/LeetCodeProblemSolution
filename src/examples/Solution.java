package examples;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 1, 5, 6, 1, 2, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3};
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int res = 0;

        for (int num : arr) {
            int check = 0;
            map.put(num, map.getOrDefault(num, 0) +1);
            if(!map.containsKey(num)) {
                map.put(num, 1);
                check = 1;
            } else {
                map.put(num, map.get(num)+1);
                check = map.get(num)+1;
            }
            if(check > max) {
                res = num;
                max = check;
            }
        }

        int[] arr2 = new int[]{2, 7, 5, 8, 5, 8, 7, 2};

        System.out.println(maxValueK(arr2));

    }

    public static int maxValueK(int A[]) {
        int res = 0;
        Arrays.sort(A);
        int index = 1;
        for(int num : A) {
            if(num == A.length-index) {
                res = num;
                break;
            }
            index++;
        }
        return res;
    }

}
