package examples.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class ProblemNumber119 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(getRow(250));
        System.out.println("Total time : " + (System.currentTimeMillis()-start));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0;i < rowIndex + 1; i ++) {
            result.add(1);
            for (int j = i; j >=0; j --) {
                if (j != 0 && j != i) {
                    result.set(j, result.get(j) + result.get(j-1));
                }
            }
        }
        return result;
    }
}
