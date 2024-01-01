package examples.easy;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/path-crossing/
 */
public class ProblemNumber1496 {
    public static void main(String[] args) {
//        System.out.println("+0-1".substring(2));
        System.out.println(isPathCrossing("SWSSENENNNWNWNWNENNENWNNNNNWNENESSENESSWSSWNN"));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> set = new TreeSet<>();
        set.add("00");
        int x = 0;
        int y = 0;
        for (char ch : path.toCharArray()) {
            if(ch == 'N') {
                ++y;
            } else if(ch == 'S') {
                --y;
            } else if(ch == 'E') {
                ++x;
            } else if(ch == 'W') {
                --x;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((x != 0 && (x < 10 || x > -10)) ? "0"+x : x+"");
            sb.append((y != 0 && (y < 10 || y > -10)) ? "0"+y : y+"");
            if(set.contains(sb.toString())) {
                return true;
            } else {
                set.add(sb.toString());
            }
        }

        return false;
    }
}
