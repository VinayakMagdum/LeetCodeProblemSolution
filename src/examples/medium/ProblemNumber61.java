package examples.medium;

public class ProblemNumber61 {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode tail = head;
        int length = 1;
        while(tail.next != null) {
            length++;
            tail = tail.next;
        }
        k = k % length;

        if (k == 0) {
            return head;
        }
        tail.next = head;

        int stepsToNewTail = length - k - 1;
        ListNode newTaleNode = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTaleNode = newTaleNode.next;
        }
        head = newTaleNode.next;
        newTaleNode.next = null;

        return head;
    }
}
