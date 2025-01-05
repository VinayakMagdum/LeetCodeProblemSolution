package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/determine-if-two-strings-are-close/
 */
public class ProblemNumber1657 {
    public static void main(String[] args) {
        String word1 = "cabbba", word2 = "abbccc";
        System.out.println(closeStrings(word1, word2));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            word1Map.put(ch, word1Map.getOrDefault(ch , 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            word2Map.put(ch, word2Map.getOrDefault(ch , 0) + 1);
        }

        if(!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        List<Integer> list1 = new ArrayList<>(word1Map.values());
        List<Integer> list2 = new ArrayList<>(word2Map.values());
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
