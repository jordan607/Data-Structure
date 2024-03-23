package LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = Main.getDoublyLinkList(null);

        Main.traversal(head,-1);
        Node slow=head, fast = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("------------------------------");
        System.out.println(slow.data);
    }
}
