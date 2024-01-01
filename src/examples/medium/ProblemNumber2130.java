package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
public class ProblemNumber2130 {

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0, j = list.size()-1;
        int maximumSum = 0;

        while (i < j) {
            maximumSum = Math.max(maximumSum, list.get(i) + list.get(j));
            i++;
            j--;
        }
        return maximumSum;
    }
}
