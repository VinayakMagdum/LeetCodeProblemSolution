package examples.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {
//    Runtime t1 = new RuntimeException();
    Map<String, List<Integer>> map;
    Map<Integer, Person> track;

    public UndergroundSystem() {
        map = new HashMap<>();
        track = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        if(!track.containsKey(id)) {
            Person person = new Person(id, stationName, null, t, 0);
            track.put(id, person);
        }
    }

    public void checkOut(int id, String stationName, int t) {
        if(track.containsKey(id)) {
            Person person = track.get(id);
            int avg  = (t - person.startTime);

            String key = person.startStation + "TO" + stationName;

            if(map.containsKey(key)) {
                map.get(key).add(avg);
            } else {
                ArrayList<Integer> list = new ArrayList();
                list.add(avg);
                map.put(key, list);
            }
            track.remove(id);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "TO" + endStation;
        double avg = 0;
        if(map.containsKey(key)) {
            for(int time : map.get(key)) {
                avg += time;
            }
            avg = avg / map.get(key).size();
        }
        return avg;
    }


    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8); // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));; // return 5.00000, (5) / 1 = 5
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16); // Customer 5 "Leyton" -> "Paradise" in 16-10 = 6
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));; // return 5.50000, (5 + 6) / 2 = 5.5
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30); // Customer 2 "Leyton" -> "Paradise" in 30-21 = 9
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));; // return 6.66667, (5 + 6 + 9) / 3 = 6.66667
    }
}

class Person {
    int id;
    String startStation;
    String endStation;
    int startTime;
    int endTime;

    public Person(int id, String startStation, String endStation, int startTime, int endTime) {
        this.id = id;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
