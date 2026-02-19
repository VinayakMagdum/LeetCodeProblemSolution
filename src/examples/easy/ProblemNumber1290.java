package examples.easy;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
 */
public class ProblemNumber1290 {
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

    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}
