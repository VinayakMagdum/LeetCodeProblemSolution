package examples.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/string-matching-in-an-array/description/?envType=daily-question&envId=2025-01-07
 */
public class ProblemNumber1408 {
    public static void main(String[] args) {
//        System.out.println("Vinayanak".indexOf("zp"));
//        System.out.println("Vinayanak".substring(4));
        System.out.println(stringMatching(new String[]{"mass","as","hero","superhero"}));
        System.out.println(stringMatching(new String[]{"leetcode","et","code"}));
        System.out.println(stringMatching(new String[]{"blue","green","bu"}));
        System.out.println(stringMatching(new String[]{"uexk","aeuexkf","wgxih","yuexk","gxea","yuexkm","ypmfx","jjuexkmb","wqpri","aeuexkfpo","kqtnz","pkqtnza","nrbb","hmypmfx","krqs","jjuexkmbyt","zvru","ypmfxj"}));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(word);
        }
        String totString = sb.toString();

        for(String word : words) {
            int wordLen = word.length();
            int startIdx = totString.indexOf(word);
            if(totString.substring(startIdx + wordLen).contains(word)) {
                ans.add(word);
            }
        }
        return ans;

//        List<String> ans = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//
//        // Concatenate all words into one string with a delimiter
//        for (String word : words) {
//            sb.append(word).append("#"); // Add a unique delimiter to separate words
//        }
//        String totString = sb.toString();
//
//        for (String word : words) {
//            int wordLen = word.length();
//            int startIdx = totString.indexOf(word);
//
//            // Ensure that the word is a substring of another word, not itself
//            if (startIdx != -1 && totString.indexOf(word, startIdx + wordLen) != -1) {
//                ans.add(word);
//            }
//        }
//        return ans;
    }
}
