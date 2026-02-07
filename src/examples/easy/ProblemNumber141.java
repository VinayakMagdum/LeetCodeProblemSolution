package examples.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class ProblemNumber141 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            this.val = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {

    }

    /**
     * SC = O(N)
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    /**
     * SC = O(N)
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if(map.containsKey(temp)) return true;
            else map.put(temp, 1);

            temp = temp.next;
        }

        return false;
    }
}
