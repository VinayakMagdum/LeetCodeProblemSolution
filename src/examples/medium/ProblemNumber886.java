package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/possible-bipartition/
 */
public class ProblemNumber886 {
    public static void main(String[] args) {
        int[][] dislikes = new int[][]{
                {1,2},{1,3},{2,4}
        };

        System.out.println(possibleBipartition(4, dislikes));
    }

    public static boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph = new List[n+1];
        Color[] colors = new Color[n+1];
        Arrays.fill(colors, Color.kWhite);

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] d : dislikes) {
            final int u = d[0];
            final int v = d[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int person = 1; person <= n; ++person)
            if (colors[person] == Color.kWhite && !isValidColor(graph, person, colors, Color.kRed))
                return false;

        return true;
    }

    private static boolean isValidColor(List<Integer>[] graph, int person, Color[] colors, Color color) {
        if(colors[person] != Color.kWhite) {
            return colors[person] == color;
        }

        colors[person] = color;
        for(int disPerson : graph[person]) {
            if(!isValidColor(graph, disPerson, colors, color == Color.kRed ? Color.kGreen : Color.kRed))
                return false;
        }

        return true;
    }
}


enum Color { kWhite, kRed, kGreen }