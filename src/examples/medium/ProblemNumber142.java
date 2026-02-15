package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class ProblemNumber142 {

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

//    public ListNode detectCycle(ListNode head) {
//        List<ListNode> list = new ArrayList<>();
//
//        ListNode temp = head;
//        while(temp != null) {
//            if(list.contains(temp)) {
//                return list.get(list.indexOf(temp));
//            }
//            list.add(temp);
//            temp = temp.next;
//        }
//
//        return null;
//    }

    private static ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slower = head;
        ListNode faster = head;
        while (slower != null && faster !=null){
            slower = slower.next;
            faster = faster.next;
            if (faster != null)
                faster = faster.next;
            if (slower == faster)
                break;
        }//while
        if (faster == null)
            return null;
        slower = head;
        while (slower != faster){
            slower = slower.next;
            faster = faster.next;
        }
        return slower;
    }

    public ListNode detectCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean doesCycleExists = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                doesCycleExists = true;
                break;
            }
        }

        if (!doesCycleExists) return null;
        ListNode start = head;
        while(true) {
            if(start == slow) {
                return start;
            }
            start = start.next;
            slow = slow.next;
        }
    }


    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet();

        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(0);
        node1.next.next.next = new ListNode(-4);
        node1.next.next.next.next = new ListNode(9);
        node1.next.next.next.next.next = new ListNode(9);
        node1.next.next.next.next.next.next = new ListNode(9);

    }
}
