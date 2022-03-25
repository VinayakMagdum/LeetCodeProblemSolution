package examples.medium;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProblemNumber435 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,100},
                {11,22},
                {1,11},
                {2,12}
        };

        System.out.println(eraseOverlapIntervals(arr));
    }
    private static int eraseOverlapIntervals(int[][] intervals) {
        //Sort on end time
        Arrays.sort(intervals,(a, b)->Integer.compare(a[1],b[1]));
        int count=0;
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(end>intervals[i][0]){
                count++;
            }
            else {
                end = intervals[i][1];
            }
        }
        return count;
    }
}
