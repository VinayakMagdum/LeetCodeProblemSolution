package examples.medium;

public class ProblemNumber707 {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    int length;
    Node head;

    public ProblemNumber707() {
        length = 0;
        head = null;
    }

    public int get(int index) {
        if(index < length && index >=0) {
            Node temp = head;
            while(index > 0) {
                temp = temp.next;
                index--;
            }
            return temp.val;
        } else {
            return -1;
        }
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp= temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index>length) return;
        if(index<0) {
            addAtHead(val);
            length++;
        } else {
            Node fake = new Node(-1);
            fake.next = head;
            Node temp = fake;
            while(index > 0) {
                temp = temp.next;
                index--;
            }
            Node newNode = new Node(val);
            Node curr = temp;
            Node next = temp.next;
            curr.next = newNode;
            newNode.next = next;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index<length&&index>=0){
            length--;
            Node dmy = new Node(0);
            dmy.next = head;
            Node cur = dmy;
            while(index>0){
                cur = cur.next;
                index--;
            }
            cur.next = cur.next.next;
            head = dmy.next;
        }
        else return;
    }

    public static void main(String[] args) {
        ProblemNumber707 obj = new ProblemNumber707();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);    // linked list becomes 1->2->3
        obj.get(1);              // return 2
        obj.deleteAtIndex(1);    // now the linked list is 1->3
        obj.get(1);              // return 3
    }
}
