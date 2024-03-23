package LinkedList;

public class PalindromeLinkedlist {
    public static void main(String[] args) {
        boolean result = isPalindrome(null);
        if (result) System.out.println("It's a palindrome.");
        else System.out.println("Not a palindrome.");
    }

    private static boolean isPalindrome(int[] arr) {
        Node head1, head2;
        if(arr== null || arr.length==0){
             head1 = Main.getDoublyLinkList(new int[] {1,2,3,2,1});
             head2 =  Main.getDoublyLinkList(new int[] {1,2,3,2,1});
        }else{
            head1 =  Main.getDoublyLinkList(arr);
            head2 =  Main.getDoublyLinkList(arr);
        }
        int c1 = Main.traversal(head1, -1);
        Node newHead = ReverseLinkedList.reverseLL(head1);
        int c2 = Main.traversal(newHead, -1);
        if(c1!= c2) return false;
        return Main.isEqual(newHead, head2);
    }
}
