package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node n1 =  new Node(10);
        Node n2 =  new Node(20);
        Node n3 =  new Node(30);
        Node n4 =  new Node(40);
        Node n5 =  new Node(50);


        Node head = n1;
        n1.next = n2;
        n2.previous = n1;
        n2.next = n3;
        n3.previous = n2;
        n3.next = n4;
        n4.previous = n3;
        n4.next = n5;
        n5.previous =n4;
        n5.next = null;

        Main.traversal(head);
        System.out.println("------------------------------");
        Node prev = null,curr = head,forw = null;

        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        Main.traversal(prev);
    }
}
