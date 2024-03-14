package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node n1 =  new Node(10);
        Node n2 =  new Node(20);
        Node n3 =  new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.previous = n1;
        n2.next = n3;
        n3.previous = n2;
        n3.next = null;
        insert(40, head, 2);
        delete(head, 2);
        traversal(head);
    }

    public static void delete(Node head, int position) {
        if(position == 0){
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position-1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public static void traversal(Node head){
        while (head!=null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void insert(int data, Node head, int position){
        Node in = new Node(data);
        Node current = head;
        if(position == 0){
            in.next = head;
            head = in;
            return;
        }
        for (int i = 0; i < position-1; i++) {
            current = current.next;
        }
        in.next = current.next;
        current.next = in;
    }
}
