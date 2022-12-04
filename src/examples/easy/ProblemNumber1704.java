package examples.easy;

import java.util.Arrays;
import java.util.List;

public class ProblemNumber1704 {
    static Character[] vowels = new Character[]{'a', 'e','i', 'o','u', 'A','E', 'I', 'O', 'U'};
    static List<Character> vowelList = Arrays.asList(vowels);
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {
        int mid = s.length() /2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        int first = 0;
        int second = 0;
        for(Character ch : a.toCharArray()) {
            if(isCharVowel(ch)) {
                first++;
            }
        }
        for(Character ch : b.toCharArray()) {
            if(isCharVowel(ch)) {
                second++;
            }
        }
        return first == second;
    }

    private static boolean isCharVowel(Character ch) {
        return vowelList.contains(ch);
    }
}
