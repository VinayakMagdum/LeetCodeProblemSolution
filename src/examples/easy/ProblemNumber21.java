package examples.easy;

import java.util.*;

public class ProblemNumber21 {
    public class ListNode {
        public int val;
        public ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode node = temp;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            }
            else{
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }
        if (list1 != null){
            node.next = list1;
        }
        else if (list2 != null){
            node.next = list2;
        }
        return temp.next;
    }
}
