package examples.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/design-underground-system/
 */
public class ProblemNumber1396 {
    Map<Integer, Map<String, Integer>> checkInMap = new HashMap<>();
    Map<String, List<Integer>> checkOutMap = new HashMap<>();


    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> map = new HashMap<>();
        map.put(stationName, t);
        checkInMap.put(id, map);
    }

    public void checkOut(int id, String stationName, int t) {
        String checkInStation = "";
        int checkInTime = 0;
        Map<String, Integer> checkInMap = this.checkInMap.get(id);
        for (Map.Entry<String, Integer> entry : checkInMap.entrySet()) {
            checkInStation = entry.getKey();
            checkInTime = entry.getValue();
        }
        String key = checkInStation + "->" + stationName;
        int time = t - checkInTime;
        if(checkOutMap.containsKey(key)) {
            checkOutMap.get(key).add(time);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(time);
            checkOutMap.put(key, list);
        }
        this.checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "->" + endStation;

        List<Integer> times = checkOutMap.get(key);
        int totalEntries =  0;
        int totalTime = 0;
        for (Integer time : times) {
            totalTime += time;
            totalEntries++;
        }

        return (double) totalTime/totalEntries;
    }

    public static void main(String[] args) {
        ProblemNumber1396  obj = new ProblemNumber1396();
//        obj.checkIn(45, "Leyton", 3);
//        obj.checkIn(32, "Paradise", 8);
//        obj.checkIn(27, "Leyton", 10);
//        obj.checkOut(45, "Waterloo", 15);  // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
//        obj.checkOut(27, "Waterloo", 20);  // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
//        obj.checkOut(32, "Cambridge", 22); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
//        System.out.println(obj.getAverageTime("Paradise", "Cambridge")); // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
//        obj.checkIn(10, "Leyton", 24);
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 11.00000
//        obj.checkOut(10, "Waterloo", 38);  // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12

        obj.checkIn(10, "Leyton", 3);
        obj.checkOut(10, "Paradise", 8); // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5
        System.out.println(obj.getAverageTime("Leyton", "Paradise")); // return 5.00000, (5) / 1 = 5
        obj.checkIn(5, "Leyton", 10);
        obj.checkOut(5, "Paradise", 16); // Customer 5 "Leyton" -> "Paradise" in 16-10 = 6
        System.out.println(obj.getAverageTime("Leyton", "Paradise")); // return 5.50000, (5 + 6) / 2 = 5.5
        obj.checkIn(2, "Leyton", 21);
        obj.checkOut(2, "Paradise", 30); // Customer 2 "Leyton" -> "Paradise" in 30-21 = 9
        System.out.println(obj.getAverageTime("Leyton", "Paradise")); // return 6.66667, (5 + 6 + 9) / 3 = 6.66667
    }
}
