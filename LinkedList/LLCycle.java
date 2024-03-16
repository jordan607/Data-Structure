package LinkedList;

public class LLCycle {
    public static void main(String[] args) {
        Node head = Main.getCircularLinkedList(null);
        Node slow = head, fast = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                System.out.println(true);
                break;
            }
        }
        if(slow!=fast)System.out.println(false);
    }
}
