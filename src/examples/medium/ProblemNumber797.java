package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/all-paths-from-source-to-target/
 */
public class ProblemNumber797 {
    public static void main(String[] args) {
        int[][] graph = new int[][] {
                {4,3,1},
                {3,2,4},
                {3},
                {4},
                {}
        };
        System.out.println(allPathsSourceTarget(graph));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(graph, 0, new ArrayList<>(Arrays.asList(0)), ans);
        return ans;
    }

    private static void dfs(int[][] graph, int u, List<Integer> path, List<List<Integer>> ans) {
        if(u == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int v : graph[u]) {
            path.add(v);
            dfs(graph, v, path, ans);
            path.remove(path.size() -1);
        }
    }
}
