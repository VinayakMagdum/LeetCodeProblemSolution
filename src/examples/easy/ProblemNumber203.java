package examples.easy;

public class ProblemNumber203 {
    class ListNode {
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

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
