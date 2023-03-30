package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleTest {
    public static void main(String[] args) {



    }

    public List<String> getPatterns(String pattern) {
        List<String> list = new ArrayList<>();
        Map<Character, List<Character>> map = new HashMap<>();
        List<Character> w = new ArrayList<>();
        w.add('A');
        w.add('T');
        List<Character> s = new ArrayList<>();
        s.add('C');
        s.add('G');
        List<Character> n = new ArrayList<>();
        n.add('A');
        n.add('T');
        n.add('C');
        n.add('G');
        map.put('W', w);
        map.put('S', s);
        map.put('N', n);

        for(int i = 0; i< pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {

            } else {

            }
        }

        return list;
    }

}
