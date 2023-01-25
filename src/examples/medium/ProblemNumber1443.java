package examples.medium;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
 */
public class ProblemNumber1443 {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        Boolean[] hasApple = new Boolean[]{false,false,true,false,true,true,false};
        System.out.println(minTime(n, edges, Arrays.asList(hasApple)));
    }

    private static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer>[] graph = new List[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] seen = new boolean[n];
        return dfs(graph, 0, seen, hasApple);
    }

    private static int dfs(List<Integer>[] graph, int u, boolean[] seen, List<Boolean> hasApple) {
        int totCost = 0;
        seen[u] = true;
        for(int v : graph[u]) {
            if(seen[v]) {
                continue;
            }
            int cost = dfs(graph, v, seen, hasApple);
            if(cost > 0 || hasApple.get(v)) {
                totCost += cost + 2;
            }
        }
        return totCost;
    }
}
