package examples.hard;

import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class ProblemNumber23 {
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
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);


        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);


        ListNode node3 = new ListNode(2);
        node3.next = new ListNode(6);

        ListNode[] nodes = new ListNode[]{node1, node2, node3};

        System.out.println(mergeKLists(nodes));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (final ListNode list : lists)
            if (list != null)
                minHeap.offer(list);

        while(!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            if(minNode.next != null) {
                minHeap.offer(minNode.next);
            }
            curr.next = minNode;
            curr = curr.next;
        }
        return dummy.next;
    }
}
