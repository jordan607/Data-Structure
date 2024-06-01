package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Main.getDoublyLinkList(null);
        Main.traversal(head, -1);
        System.out.println("------------------------------");
//        Node prev = reverseLL(head);
        Node prev = reverseLLRec(head);
        Main.traversal(prev, -1);
//        recursionReverse(head);
    }

    public static Node reverseLL(Node head) {
        Node prev = null,curr = head,forw = null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        head = prev;
        return head;
    }
//https://www.youtube.com/watch?v=KYH83T4q6Vs&ab_channel=mycodeschool
    public static void recursionReverse(Node head){
        if(head == null) return;
        recursionReverse(head.next);
        System.out.print(head.data+ " ");
    }

    public static Node reverseLLRec(Node head){
        if(head.next== null) return head;
        Node newHeadNode = reverseLLRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }
}
