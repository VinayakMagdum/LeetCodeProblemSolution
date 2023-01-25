package examples.medium;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/keys-and-rooms/
 */
public class ProblemNumber841 {
    public static void main(String[] args) {

    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] seen = new int[rooms.size()];
        dfs(rooms, 0, seen);
        return Arrays.stream(seen).allMatch(a -> a == 1);
    }

    private static void dfs(List<List<Integer>> rooms, int node, int[] seen) {
        seen[node] = 1;
        for (final int child : rooms.get(node))
            if (seen[child] == 0)
                dfs(rooms, child, seen);
    }

}
