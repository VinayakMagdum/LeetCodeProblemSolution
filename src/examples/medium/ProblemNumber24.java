package examples.medium;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class ProblemNumber24 {
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

        ListNode result = swapPairs(node1);
        System.out.println(result);
    }

    private static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode temp = fake;
        while(temp != null && temp.next != null && temp.next.next != null) {
            ListNode first = temp;
            ListNode second = temp.next;
            ListNode third = temp.next.next;
            first.next = third;
            second.next = third.next;
            third.next = second;
            temp = second;
        }

        return fake.next;
    }


}
