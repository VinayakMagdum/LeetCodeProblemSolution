package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/peeking-iterator/
 */
public class ProblemNumber284 implements Iterator<Integer> {
    List<Integer> list;
    int i = 0;
    public ProblemNumber284(Iterator<Integer> iterator) {
        list = new ArrayList<>();
        // initialize any member here.
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(i < list.size()) {
            int res = list.get(i);
            i++;
            return res;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(i+1 <= list.size()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String [] args) {
        ProblemNumber284 peekingIterator = new ProblemNumber284(Arrays.asList(new Integer[]{1, 2, 3, 4}).iterator());
        System.out.println(peekingIterator.hasNext());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());;
        System.out.println(peekingIterator.peek());;
        System.out.println(peekingIterator.next());;
        System.out.println(peekingIterator.hasNext());;
        System.out.println(peekingIterator.peek());;
        System.out.println(peekingIterator.hasNext());;
        System.out.println(peekingIterator.next());;
        System.out.println(peekingIterator.hasNext());;
    }
}
