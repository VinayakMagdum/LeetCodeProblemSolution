package examples.medium;


import java.util.ArrayList;
import java.util.List;

public class ProblemNumber2477 {
    private static long ans = 0;
    public static void main(String[] args) {
        int[][] roads = new int[][]{
                {3,1},
                {3,2},
                {1,0},
                {0,4},
                {0,5},
                {4,6}
        };

        System.out.println(minimumFuelCost(roads, 2));
    }

    public static long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph = new List[roads.length+1];

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] road : roads) {
            int u = road[0];
            int v = road[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(graph, 0, -1, seats);
        return ans;
    }

    private static int dfs(List<Integer>[] graph, int u, int prev, int seats) {
        int people = 1;
        for(int v : graph[u]) {
            if (v == prev)
                continue;
            people += dfs(graph, v, u, seats);
        }

        if (u > 0)
            // # of cars needed = ceil(people / seats)
            ans += (people + seats - 1) / seats;
        return people;
    }
}
