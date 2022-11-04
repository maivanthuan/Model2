package ss9_Arraylist.thuc_hanh;




public class Mylinkedlist{
    private Node head;
    private int numNodes;

    public Mylinkedlist(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public static void main(String[] args) {
        System.out.println("----------TEST---------");
        Mylinkedlist linkedList=new Mylinkedlist(10);
        linkedList.addFirst(1);
        linkedList.add(1,4);
        linkedList.add(2,4);
        linkedList.add(3,4);
        linkedList.printList();
        }
}
