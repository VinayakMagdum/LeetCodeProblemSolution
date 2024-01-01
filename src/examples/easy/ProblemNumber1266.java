package examples.easy;

/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 */
public class ProblemNumber1266 {
    public static void main(String[] args) {
//        int [] [] arr = new int[][]{
//                {1,1},
//                {3,4},
//                {-1, 0}
//        };

        int [] [] arr = new int[][]{
                {3,2},
                {-2,2}
        };

        System.out.println(minTimeToVisitAllPoints(arr));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for(int i = 1; i < points.length; i++) {
            int [] first = points[i-1];
            int [] second = points[i];
            int x1 = first[0];
            int y1 = first[1];
            int x2 = second[0];
            int y2 = second[1];
            int diagonalTraverse = Math.abs(x2 - x1);
            int verticalTraverse = Math.abs(y2 - y1);
            ans += diagonalTraverse + verticalTraverse;
        }

        return ans;
    }
}
