package examples.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/replace-words/
 */
public class ProblemNumber648 {
    public static void main(String[] args) {
//        String[] arr = new String[] {"cat","bat","rat"};
//        List<String> list = Arrays.asList(arr);
//        String sentence = "the cattle was rattled by the battery";


//        String[] arr = new String[] {"a","b","c"};
//        List<String> list = Arrays.asList(arr);
//        String sentence = "aadsfasf absbs bbab cadsfafs";


        String[] arr = new String[] {"a", "aa", "aaa", "aaaa"};
        List<String> list = Arrays.asList(arr);
        String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";

        System.out.println(replaceWords(list, sentence));
//        System.out.println("test".substring(0, 5));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Set<String> set = new HashSet<>(dictionary);

        for (int i = 0; i < words.length; i++) {
            words[i] = getEquivalentString(words[i], set);
        }

        return String.join(" ", words);
//        String ans = "";
//
//        for (String word : words) {
//            boolean found = false;
//            for (int i = 0; i < word.length(); i++) {
//                if (dictionary.contains(word.substring(0, i+1))) {
//                    ans += word.substring(0, i+1);
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) ans+= word;
//            ans += " ";
//        }
//
//        return ans.trim();
    }

    private static String getEquivalentString(String word, Set dictSet) {
        for (int i = 1; i <= word.length(); i++) {
            String root = word.substring(0, i);
            if (dictSet.contains(root)) {
                return root;
            }
        }
        return word;
    }
}
