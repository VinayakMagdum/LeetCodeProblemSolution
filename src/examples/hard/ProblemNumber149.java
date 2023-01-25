package examples.hard;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/max-points-on-a-line/
 */
public class ProblemNumber149 {
    public static void main(String[] args) {
        int[][] points = new int[][]{
//                {1,1},
//                {3,2},
//                {5,3},
//                {4,1},
//                {2,3},
//                {1,4}
                {1,1},
                {2,2},
                {3,3}
        };
        System.out.println(maxPoints(points));
    }

    public static int maxPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; ++i) {
            HashMap<Integer, HashMap<Integer, Integer>> lines = new HashMap<>();
            int duplicate = 1;
            for (int j = i + 1; j < points.length; ++j) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    duplicate++;
                    continue;
                }
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                int d = gcd(dx, dy);
                if (!lines.containsKey(dx/d)) {
                    lines.put(dx/d, new HashMap<Integer, Integer>());
                }
                if (!lines.get(dx/d).containsKey(dy/d)) {
                    lines.get(dx/d).put(dy/d, 0);
                }
                lines.get(dx/d).put(dy/d, lines.get(dx/d).get(dy/d) + 1);
            }
            res = Math.max(res, duplicate);
            for (Integer a:lines.keySet()) {
                for (Integer b:lines.get(a).keySet()) {
                    res = Math.max(res, lines.get(a).get(b) + duplicate);
                }
            }
        }
        return res;
    }

    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}