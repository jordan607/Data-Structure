package LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = Main.getDoublyLinkList(null);

        Main.traversal(head);
        Node slow=head, fast = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("------------------------------");
        System.out.println(slow.data);
    }
}
