package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class ProblemNumber49 {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

//    private static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> lists = new ArrayList<>();
//        if(strs.length == 1) {
//            List<String> list = new ArrayList<>();
//            list.add(strs[0]);
//            lists.add(list);
//        }
//        boolean[] visited = new boolean[strs.length];
//
//        for(int i = 0; i < strs.length; i++) {
//            if(!visited[i]) {
//                List<String> list = new ArrayList<>();
//                list.add(strs[i]);
//                visited[i] = true;
//                char[] first = strs[i].toCharArray();
//                Arrays.sort(first);
//                for(int j = i + 1; j < strs.length; j++) {
//                    if(!visited[j]) {
//                        char[] second = strs[j].toCharArray();
//                        Arrays.sort(second);
//                        if(Arrays.equals(first, second)) {
//                            visited[j] = true;
//                            list.add(strs[j]);
//                        }
//                    }
//                }
//                lists.add(list);
//            }
//        }
//
//        return lists;
//    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> helper = new HashMap<>();
        for (int i = 0; i < strs.length; i ++) {
            char[] tmpChar = strs[i].toCharArray();
            Arrays.sort(tmpChar);
            String tmp = new String(tmpChar);
            if (helper.containsKey(tmp)) {
                result.get(helper.get(tmp)).add(strs[i]);
                continue;
            }
            List<String> list = new LinkedList<>();
            list.add(strs[i]);
            result.add(list);
            helper.put(tmp, result.size() - 1);
        }
        return result;
    }

}
