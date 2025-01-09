package examples.easy;

/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/description/?envType=daily-question&envId=2025-01-09
 */
public class ProblemNumber2185 {
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
        System.out.println(prefixCount(new String[]{"leetcode","win","loops","success"}, "code"));
    }

    public static int prefixCount(String[] words, String pref) {
        int ans = 0;

        for(String word : words) {
            if (word.startsWith(pref)) ans++;
        }

        return ans;
    }
}
