package LinkedList;
public class LinkedListIntersection {
    public static void main(String[] args) {
        /*
        * case 1
        * */
        Node head1 = Main.getDoublyLinkList(new int[] {4,1,8,4,5});
        Node head2 = Main.getDoublyLinkList(new int[] {5,6,1});
        Main.attachTwoLinkedListBackwards(head1, head2, 2);

        /*
         * case 2
         * */
//        Node head1 = Main.getDoublyLinkList(new int[] {4,1,8,4,5});
//        Node head2 = Main.getDoublyLinkList(new int[] {6,1,8,4,5});


        /*
         * case 3
         * */
//        Node head1 = Main.getDoublyLinkList(new int[] {4,1,8,4,5});
//        Node head2 = Main.getDoublyLinkList(new int[] {6,1,8,4,5});
//        Main.attachTwoLinkedListBackwards(head1, head2, 2);


        /*
         * case 3
         * */
//        Node head1 = Main.getDoublyLinkList(new int[] {4,1,8,4,5});
//        Node head2 = Main.getDoublyLinkList(new int[] {6,1,8,5});



        Node intersectingNode = getIntersectionNode(head1, head2);
        if(intersectingNode != null) System.out.println(intersectingNode.data);
        else System.out.println("No intersecting Node");
    }

    private static Node getIntersectionNode(Node head1, Node head2) throws NullPointerException{
        Node tempHead1 = head1;
        Node tempHead2 = head2;

        while (head1 != head2){
            if(head1 == null) head1 = tempHead2;
            if(head2 == null) head2 = tempHead1;
            if(head1 == head2) break;

            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;
    }
}
//         Test Code for merging linked list
//        Main.attachTwoLinkedListsForward(head1,head2,2);
//        Main.traversal(head2, 4);