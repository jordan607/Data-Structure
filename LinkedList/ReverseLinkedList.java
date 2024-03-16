package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Main.getDoublyLinkList(null);
        Main.traversal(head);
        System.out.println("------------------------------");
        Node prev = reverseLL(head);
        Main.traversal(prev);
    }

    public static Node reverseLL(Node head) {
        Node prev = null,curr = head,forw = null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}
