package examples.easy;

import examples.medium.ProblemNumber142;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class ProblemNumber160 {

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
        node1.next = new ListNode(9);
        node1.next.next = new ListNode(1);
        node1.next.next.next = new ListNode(2);
        node1.next.next.next.next = new ListNode(4);

        ListNode node2 = new ListNode(3);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(4);

        ListNode result = getIntersectionNode(node1, node2);
        System.out.println(result);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;

        while(l1 != l2){
            l1=l1.next;
            l2=l2.next;
            if(l1==null){
                l1=headB;
                headB=null;
            }
            if(l2==null){
                l2=headA;
                headA=null;
            }
        }
        return l1;
    }

    private static ListNode getIntersectionNode2 (ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (a!= null) {
            lengthA++;
            a = a.next;
        }
        while (b != null) {
            lengthB++;
            b = b.next;
        }

        a = headA;
        b = headB;
        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            while (diff > 0) {
                a = a.next;
                diff--;
            }
        } else {
            int diff = lengthB - lengthA;
            while (diff > 0) {
                b = b.next;
                diff--;
            }
        }

        while (a!= null && b != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return null;
    }
}
