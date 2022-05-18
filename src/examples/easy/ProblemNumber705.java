package examples.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/design-hashset/
 */
public class ProblemNumber705 {
    Set<Integer> set;

    public ProblemNumber705() {
        set = new HashSet<>();
    }

    public void add(int key) {
        set.add(key);
    }

    public void remove(int key) {
        if(set.contains(Integer.valueOf(key))) {
            set.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        return set.contains(Integer.valueOf(key));
    }

    public static void main(String[] args) {
        ProblemNumber705 set = new ProblemNumber705();
        set.add(1);      // set = [1]
        set.add(2);      // set = [1, 2]
        set.contains(1); // return True
        set.contains(3); // return False, (not found)
        set.add(2);      // set = [1, 2]
        set.contains(2); // return True
        set.remove(2);   // set = [1]
        set.contains(2); // return False, (already removed)
    }
}
