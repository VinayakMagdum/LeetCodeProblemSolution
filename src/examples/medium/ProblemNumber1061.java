package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/lexicographically-smallest-equivalent-string/
 */
public class ProblemNumber1061 {
    static class UnionFind {
        private int[] id;
        public UnionFind(int n) {
            id = new int[n];
            for (int i = 0; i < n; ++i)
                id[i] = i;
        }

        public void union(int u, int v) {
            final int i = find(u);
            final int j = find(v);
            if (i > j)
                id[i] = j;
            else
                id[j] = i;
        }

        public int find(int u) {
            return id[u] == u ? u : (id[u] = find(id[u]));
        }
    }


    public static void main(String[] args) {
        String s1 = "dccaccbdafgeabeeghbigbhicggfbhiccfgbechdicbhdcgahi", s2 = "igfcigeciahdafgegfbeddhgbacaeehcdiehiifgbhhehhccde",
                baseStr = "sanfbzzwblekirguignnfkpzgqjmjmfokrdfuqbgyflpsfpzbo";
        System.out.println(smallestEquivalentString(s1, s2, baseStr));
    }

    public static String smallestEquivalentString(String s1, String s2, String baseStr) {
        StringBuilder sb = new StringBuilder();
        UnionFind uf = new UnionFind(26);

        for (int i = 0; i < s1.length(); ++i)
            uf.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');

        for (final char c : baseStr.toCharArray())
            sb.append((char) ('a' + uf.find(c - 'a')));

        return sb.toString();
    }
}
