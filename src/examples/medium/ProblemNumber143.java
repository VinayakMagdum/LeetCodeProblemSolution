package examples.medium;

import java.util.List;
import java.util.ArrayList;
/**
 * https://leetcode.com/problems/reorder-list/
 */
public class ProblemNumber143 {

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

        reorderList(node1);
    }

    private static void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<ListNode>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        int start = 0;
        int end = list.size()-1;
        ListNode fake = new ListNode(-1);
        ListNode temp = fake;
        while(start <= end) {
            if(start == end) {
                ListNode mid = list.get(start);
                temp.next = mid;
                temp.next.next = null;
            }
            ListNode first = list.get(start);
            ListNode second = list.get(end);
            temp.next = first;
            first.next = second;
            second.next = null;
            temp = first.next;
            start++;
            end--;
        }

        head = fake.next;
    }
}
