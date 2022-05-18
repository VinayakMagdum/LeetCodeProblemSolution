package examples.medium;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 */

class Item {
    char c;
    int freq;
    Item(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}

public class ProblemNumber1209 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    private static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        LinkedList<Item> stack = new LinkedList<>();
        for(char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().c == c)
                ++stack.peek().freq;
            else
                stack.push(new Item(c, 1));

            if (stack.peek().freq == k)
                stack.pop();
        }


        while (!stack.isEmpty()) {
            Item item = stack.pop();
            for (int i = 0; i < item.freq; ++i)
                sb.append(item.c);
        }

        return sb.reverse().toString();

    }
}
