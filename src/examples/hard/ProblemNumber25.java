package examples.hard;

public class ProblemNumber25 {
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
        node1.next.next.next.next = new ListNode(5);

        ListNode result = reverseKGroup(node1, 2);
        System.out.println(result);
    }

    private static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k ==1) {
            return head;
        }

        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode temp = fake;
        int i=0;
        ListNode p = head;
        while(p!=null){
            i++;
            if(i%k==0){
                temp = reverse(temp, p.next);
                p = temp.next;
            } else {
                p = p.next;
            }
        }
        return fake.next;
    }

    private static ListNode reverse(ListNode temp, ListNode next) {
        ListNode last = temp.next;
        ListNode curr = last.next;

        while(curr != next){
            last.next = curr.next;
            curr.next = temp.next;
            temp.next = curr;
            curr = last.next;
        }
        return last;
    }
}
