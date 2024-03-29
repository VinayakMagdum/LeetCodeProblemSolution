package examples.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ProblemNumber2359 {
    public static void main(String[] args) {
        int[] edges = new int[]{2,2,3,-1};
        int node1 = 0, node2 = 1;
        System.out.println(closestMeetingNode(edges, node1, node2));
    }

    public static int closestMeetingNode(int[] edges, int node1, int node2) {
        HashMap<Integer, Integer> vis = new HashMap<>();
        for (int i=node1, d=0; i>=0 && !vis.containsKey(i); i=edges[i])
            vis.put(i, d++);

        HashSet<Integer> vis2 = new HashSet<>();
        int res=-1, dist = 0, min=Integer.MAX_VALUE;

        for(int i=node2; i>=0 && !vis2.contains(i); i=edges[i]){
            if(vis.containsKey(i)){
                int curr = Math.max(dist, vis.get(i));
                if(res==-1 || curr<=min){
                    res = curr==min ? Math.min(res, i) : i;
                    min = curr;
                }
            }
            dist++; vis2.add(i);
        }
        return res;
    }
}
