package examples.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/naming-a-company/
 */
public class ProblemNumber2306 {
    public static void main(String[] args) {
        System.out.println(distinctNames(new String[]{"coffee","donuts","time","toffee"}));
    }

    public static long distinctNames(String[] ideas) {
        long ans = 0;
        Set<String>[] suffixes = new Set[26];

        for (int i = 0; i < 26; ++i)
            suffixes[i] = new HashSet<>();

        for (final String idea : ideas)
            suffixes[idea.charAt(0) - 'a'].add(idea.substring(1));

        for (int i = 0; i < 25; ++i)
            for (int j = i + 1; j < 26; ++j) {
                int count = 0;
                for (final String suffix : suffixes[i])
                    if (suffixes[j].contains(suffix))
                        ++count;
                ans += 2 * (suffixes[i].size() - count) * (suffixes[j].size() - count);
            }

        return ans;
    }
}
