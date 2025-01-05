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
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }

        int eleToRemove = length - n;
        List<Integer> list = new ArrayList<>();

        int index = 0;
        while (head != null) {
            System.out.println(head.val);
            if(index != eleToRemove) {
                list.add(head.val);
            }
            index++;
            head = head.next;
        }
        if (list.size() > 0) {
            ListNode result = new ListNode(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                result.next = new ListNode(list.get(i));
                result = result.next;
            }
            return result;
        } else {
            return null;
        }
    }

}
