package examples.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public class ProblemNumber380 {
    Set<Integer> set;
    public static void main(String[] args) {

    }

    public ProblemNumber380() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }
}
