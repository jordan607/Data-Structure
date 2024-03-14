package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Main.getDoublyLinkList();

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
