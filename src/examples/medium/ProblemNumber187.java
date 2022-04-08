package examples.medium;

import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/repeated-dna-sequences/
 */
public class ProblemNumber187 {

    public static void main(String[] args) {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(str));
    }

    private static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new LinkedList<>();
        if(s== null || s.length() < 10) {
            return list;
        }
        Map<String, Boolean> map = new HashMap<>();

        for(int i = 0; i < s.length() - 9; i++) {
            String str = s.substring(i, i+10);
            if(!map.containsKey(str)){
                map.put(str, true);
            } else {
                if(map.get(str)) {
                    list.add(str);
                }
                map.put(str, false);
            }
        }
        return list;
    }
}
