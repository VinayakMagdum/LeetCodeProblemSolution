package examples.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/destination-city/
 */
public class ProblemNumber1436 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"London","New York"};
        String[] arr2 = new String[]{"New York","Lima"};
        String[] arr3 = new String[]{"Lima","Sao Paulo"};

        List<String> list1 = Arrays.asList(arr1);
        List<String> list2 = Arrays.asList(arr2);
        List<String> list3 = Arrays.asList(arr3);

        List<List<String>> paths = new ArrayList<>();
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);

        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        if(paths.size() == 1) {
            return paths.get(0).get(1);
        }
        Map<String, String> map = new HashMap<>();

        for (List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }

        for (List<String> list : paths) {
            if (!map.containsKey(list.get(1))) {
                return list.get(1);
            }
        }
        return "";
    }
}
