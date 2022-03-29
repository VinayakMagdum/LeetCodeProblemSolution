package examples.medium;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class ProblemNumber82 {

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
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(1);
        node1.next.next.next = new ListNode(2);
        node1.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(node1);
        System.out.println(result);
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode temp = fake;
        while(temp.next != null && temp.next.next != null) {
            if(temp.next.val == temp.next.next.val) {
                int val = temp.next.val;
                while(temp.next != null && temp.next.val == val) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        return fake.next;
    }


}
