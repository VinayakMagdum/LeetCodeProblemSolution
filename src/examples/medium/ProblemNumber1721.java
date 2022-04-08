package examples.medium;

/**
 * https://leetcode.com/problems/swapping-nodes-in-a-linked-list/submissions/
 */
public class ProblemNumber1721 {

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

        ListNode result = swapNodes(node1, 2);
        System.out.println(result);
    }

    private static ListNode swapNodes(ListNode head, int k) {
        ListNode front = head;
        ListNode last = head;
        for(int i = 0; i < k; i++) {
            front = front.next;
        }
        ListNode temp = front;
        while(temp != null) {
            temp = temp.next;
            last = last.next;
        }
        swapVal(front, last);
        return head;
    }

    private static void swapVal(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}
