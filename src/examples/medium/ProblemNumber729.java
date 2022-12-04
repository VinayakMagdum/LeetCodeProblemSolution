package examples.medium;

import java.util.TreeMap;

/**
 * https://leetcode.com/problems/my-calendar-i/
 */
public class ProblemNumber729 {
    TreeMap<Integer, Integer> calendar;
    public ProblemNumber729() {
        calendar = new TreeMap();
    }

    public static void main(String[] args) {
        ProblemNumber729 obj = new ProblemNumber729();
        System.out.println(obj.book(5, 10));
        System.out.println(obj.book(10, 20));
        System.out.println(obj.book(35, 45));
        System.out.println(obj.book(15, 25));
        System.out.println(obj.book(20, 30));
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}
