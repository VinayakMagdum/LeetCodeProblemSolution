package examples.medium;

import examples.hard.ProblemNumber25;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class ProblemNumber19 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }

        ListNode(int value) {
            this.val = value;
        }

        ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }

    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(node1, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int length = 0;

        // Find length
        while (dummy != null) {
            length++;
            dummy = dummy.next;
        }

        // Remove head
        if (length == n) {
            return head.next;
        }

        int target = length - n - 1;
        dummy = head;

        // Move to previous node
        for (int i = 0; i < target; i++) {
            dummy = dummy.next;
        }

        // Delete node
        dummy.next = dummy.next.next;

        return head;
    }

}
