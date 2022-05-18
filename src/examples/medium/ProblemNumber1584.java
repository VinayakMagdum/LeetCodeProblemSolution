package examples.medium;

/**
 * https://leetcode.com/problems/min-cost-to-connect-all-points/
 */
public class ProblemNumber1584 {
    public static void main(String[] args) {
        int[][] points = new int[][]{
                {0,0},
                {2,2},
                {3,10},
                {5,2},
                {7,0}
        };
        System.out.println(minCostConnectPoints(points));
    }

    private static int minCostConnectPoints(int[][] points) {
        int len = points.length;
        int minCost = 0;
        int edgeVisited = 0;

        boolean[] visited = new boolean[len];

        int[] minDist = new int[len];
        minDist[0] = 0;

        for(int i = 1; i< len; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }

        while(edgeVisited < len) {
            int currMinEdge = Integer.MAX_VALUE;
            int currNode = -1;

            for(int node = 0; node < len; ++node) {
                if(!visited[node] && currMinEdge > minDist[node]) {
                    currMinEdge = minDist[node];
                    currNode = node;
                }
            }

            minCost += currMinEdge;
            edgeVisited++;
            visited[currNode] = true;

            for(int nextNode = 0; nextNode < len; ++nextNode) {
                int weight = Math.abs(points[currNode][0] - points[nextNode][0])+
                        Math.abs(points[currNode][1] - points[nextNode][1]);

                if(!visited[nextNode] && minDist[nextNode] > weight) {
                    minDist[nextNode] = weight;
                }
            }
        }
        return minCost;
    }
}
