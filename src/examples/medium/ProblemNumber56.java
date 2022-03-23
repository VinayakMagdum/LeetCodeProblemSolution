package examples.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class ProblemNumber56 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
//        int[][] arr = new int[][]{
//                {1,4},
//                {0,4}
//        };

//        int[][] arr = new int[][]{
//                {1,4},
//                {0,2},
//                {3,5}
//        };

        System.out.println(merge(arr));

//        int[][] results =  merge(arr);
//        for (int[] result  : results) {
//
//            for (int num : result) {
//                System.out.println(num + ", ");
//            }
//            System.out.println();

//        }

    }

    private static List<List<Integer>> merge(int[][] intervals) {
//        if(intervals.length ==1) {
//            return intervals;
//        }
        int[][] arr = new int[10000][2];
        List<List<Integer>> lists = new ArrayList<>();
        int row = 0;

        for(int i = 0; i < intervals.length-1; i++){
                List<Integer> list = new ArrayList<>();
                if( ((intervals[i][1] >= intervals[i+1][0]) &&  (intervals[i][1] <= intervals[i+1][1])) ||
                        ((intervals[i+1][1] >= intervals[i][0]) && (intervals[i+1][1] <= intervals[i][1]))
                ) {
                    if(intervals[i][0] < intervals[i+1][0]) {
                        list.add(intervals[i][0]);
                    } else {
                        list.add(intervals[i+1][0]);
                    }

                    if(intervals[i][1] > intervals[i+1][1]) {
                        list.add(intervals[i][1]);
                    } else {
                        list.add(intervals[i+1][1]);
                    }

                    lists.add(list);
                    i++;
                }
                else {
                    list.add(intervals[i][0]);
                    list.add(intervals[i][1]);
                    lists.add(list);
                    arr[row][0] = intervals[i][0];
                    arr[row][1] = intervals[i][1];
                    row++;
                    if(i == intervals.length-2) {
                        List<Integer> last = new ArrayList<>();
                        last.add(intervals[i+1][0]);
                        last.add(intervals[i+1][1]);
                        lists.add(last);
                        arr[row][0] = intervals[i+1][0];
                        arr[row][1] = intervals[i+1][1];
                    }
                }
            }
        int[][] arr3 = new int[lists.size()][2];
        int index = 0;
        for (List<Integer> list : lists) {
            arr3[index][0] = list.get(0);
            arr3[index][1] = list.get(1);
            index++;
        }
        return lists;
    }


//    private static int[][] merge(int[][] intervals) {
//        int n = intervals.length;
//        if (n == 0) {
//            return new int[0][];
//        }
//        // Sort
//        Arrays.sort(intervals, (o1, o2) -> (o1[0] - o2[0])); // by starting time
//        // Init
//        List<int[]> result = new ArrayList<>();
//        int[] prev = intervals[0]; // requires 0-size check
//        result.add(prev);
//        // Go through each interval (skip the first interval)
//        for (int i = 1; i < n; ++i) {
//            int[] curr = intervals[i];
//            if (prev[1] >= curr[0] && prev[1] <= curr[1]) {
//                // partially overlapped
//                prev[1] = curr[1]; // just modify existing prev -> combine
//            } else if (prev[1] >= curr[1]) {
//                // prev contains curr (inclusive) -> ignore curr
//                continue;
//            } else { // do not overlapped
//                int[] newInterval = new int[] { curr[0], curr[1] };
//                result.add(newInterval);
//                prev = newInterval;
//            }
//        }
//        // Convert to int[][]
//        int[][] ret = new int[result.size()][];
//        for (int i = 0; i < result.size(); ++i) {
//            ret[i] = result.get(i);
//        }
//        return ret;
//    }
}
