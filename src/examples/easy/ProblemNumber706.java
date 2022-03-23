package examples.easy;

public class ProblemNumber706 {
    public static void main(String[] args) {
        ProblemNumber706 obj= new ProblemNumber706();
        obj.performOperations();
    }

    public void performOperations() {
        MyHashMap myHashMap = new MyHashMap(10000);
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }

    class MyHashMap {
        Node[] nodes;

        public MyHashMap(int size) {
            nodes = new Node[size];
        }

        public void put(int key, int value) {
            int index = getIndex(key);

            Node prev = findPrevElement(index, key);

            if(prev.next == null) {
                prev.next = new Node(key, value);
            } else {
                prev.next.value = value;
            }
        }

        public int get(int key) {
            int index = getIndex(key);

            Node prev = findPrevElement(index, key);

            if(prev.next == null) {
                return -1;
            } else {
                return prev.next.value;
            }
        }

        public void remove(int key) {
            int index = getIndex(key);
            Node prev = findPrevElement(index, key);

            if(prev.next != null) {
                prev.next = prev.next.next;
            }
        }

        private int getIndex(int key) {
            return Integer.hashCode(key) % nodes.length;
        }

        private Node findPrevElement(int index, int key) {
            if(nodes[index] == null) {
                return nodes[index] = new Node(-1,-1);
            }
            Node prev = nodes[index];
            while (prev.next!=null && prev.next.key != key) {
                prev = prev.next;
            }

            return prev;
        }
    }

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
