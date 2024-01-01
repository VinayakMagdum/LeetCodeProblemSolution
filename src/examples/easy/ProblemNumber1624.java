package examples.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 */
public class ProblemNumber1624 {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
//        Map<Character, List<Integer>> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)) {
//                if(map.get(ch).size() > 1) {
//                    map.get(ch).remove(1);
//                    map.get(ch).add(1, i);
//                }else {
//                    map.get(ch).add(i);
//                }
//            } else {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                map.put(ch, list);
//            }
//        }
//        for (List<Integer> list : map.values()) {
//            if(list.size() == 2) {
//                ans = Math.max(ans, list.get(1) - list.get(0) -1);
//            }
//        }


        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                ans = Math.max(ans, i - map.get(ch) - 1);
            } else {
                map.put(ch, i);
            }
        }
        return ans;
    }
}
