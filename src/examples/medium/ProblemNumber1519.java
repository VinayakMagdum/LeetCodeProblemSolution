package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/
 */
public class ProblemNumber1519 {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = new int[][] {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";

        System.out.println(Arrays.toString(countSubTrees(n, edges, labels)));
    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ans = new int[n];
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
        dfs(graph, ans, 0, -1, labels);
        return ans;
    }

    private static int[] dfs(List<Integer>[] graph, int[] ans, int u, int parent, final String labels) {
        int[] letters = new int[26];
        for(int v : graph[u]) {
            if(v == parent)
                continue;

            int[] childCount = dfs(graph, ans, v, u, labels);
            for (int i = 0; i < 26; ++i)
                letters[i] += childCount[i];
        }
        ans[u] = ++letters[labels.charAt(u) - 'a']; // The u itself
        return letters;
    }
}
