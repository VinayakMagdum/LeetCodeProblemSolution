package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class ProblemNumber2 {

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
//        ListNode node1 = new ListNode(2);
//        node1.next = new ListNode(4);
//        node1.next.next = new ListNode(3);
//
//        ListNode node2 = new ListNode(5);
//        node2.next = new ListNode(6);
//        node2.next.next = new ListNode(4);


        ListNode node1 = new ListNode(9);
        node1.next = new ListNode(9);
        node1.next.next = new ListNode(9);
        node1.next.next.next = new ListNode(9);
        node1.next.next.next.next = new ListNode(9);
        node1.next.next.next.next.next = new ListNode(9);
        node1.next.next.next.next.next.next = new ListNode(9);

        ListNode node2 = new ListNode(9);
        node2.next = new ListNode(9);
        node2.next.next = new ListNode(9);
        node2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(node1, node2);
        System.out.println(result);
    }

//    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        List<ListNode> lists = new ArrayList<>();
//        ListNode prev = new ListNode();
//        int carry = 0;
//        while(l1 != null || l2 != null) {
//            int sum = 0;
//            if(l1 != null) {
//                sum += l1.val;
//                l1 = l1.next;
//            }
//            if(l2 != null) {
//                sum += l2.val;
//                l2 = l2.next;
//            }
//            ListNode next = new ListNode((sum + carry)%10);
//            carry = (sum + carry)/10;
//            lists.add(next);
//        }
//        if(carry != 0) {
//            ListNode next = new ListNode(carry);
//            lists.add(next);
//        }
//
//        for (int i = 0; i < lists.size()-1; i++) {
//            lists.get(i).next = lists.get(i+1);
//        }
//        return lists.get(0);
//    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            curr.next = new ListNode(digit);
            curr = curr.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }


        return dummy.next;
    }
}
