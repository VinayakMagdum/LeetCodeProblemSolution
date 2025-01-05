package examples.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/most-profit-assigning-work/
 */
public class ProblemNumber826 {
    public static void main(String[] args) {
//        int[] difficulty = new int[] {2,4,6,8,10};
//        int[] profit = new int[] {10,20,30,40,50};
//        int[] worker = new int[] {4,5,6,7};

//        int[] difficulty = new int[] {85,47,57};
//        int[] profit = new int[] {24,66,99};
//        int[] worker = new int[] {40,25,25};

//        int[] difficulty = new int[] {68,35,52,47,86};
//        int[] profit = new int[] {67,17,1,81,3};
//        int[] worker = new int[] {92,10,85,84,82};

        int[] difficulty = new int[] {66,1,28,73,53,35,45,60,100,44,59,94,27,88,7,18,83,18,72,63};
        int[] profit = new int[] {66,20,84,81,56,40,37,82,53,45,43,96,67,27,12,54,98,19,47,77};
        int[] worker = new int[] {61,33,68,38,63,45,1,10,53,23,66,70,14,51,94,18,28,78,100,16};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            if(map.containsKey(difficulty[i])) {
                map.put(difficulty[i], Math.max(map.get(difficulty[i]), profit[i]));
            } else {
                map.put(difficulty[i], profit[i]);
            }
        }
        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int totalProf = 0;

        for (int i = 0; i < worker.length; i++) {
            int work = worker[i];
            for (int key : sortedMap.keySet()) {
                if (key <= work) {
                    totalProf += sortedMap.get(key);
                    break;
                }
            }
        }
        return totalProf;
    }
}
