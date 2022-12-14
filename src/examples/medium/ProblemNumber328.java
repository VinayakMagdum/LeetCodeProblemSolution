package examples.medium;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class ProblemNumber328 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);

        System.out.println(oddEvenList(node));
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;

        for(boolean isOdd = true; head != null; head = head.next, isOdd = !isOdd) {
            if(isOdd) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
        }

        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}
