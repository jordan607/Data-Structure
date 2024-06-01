package LinkedList;

import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Node head = getDoublyLinkList(null);

        insert(40, head, 2);
        delete(head, 2);
        traversal(head, -1);
    }

    public static Node getDoublyLinkList(int[] elements) {
        Result result = getTestData(elements);

//        Node head = result.nodes[0];
//        result.nodes[0].next = result.nodes[1];
//        result.nodes[1].previous = result.nodes[0];
//        result.nodes[1].next = result.nodes[2];
//        result.nodes[2].previous = result.nodes[1];
//        result.nodes[2].next = result.nodes[3];
//        result.nodes[3].previous = result.nodes[2];
//        result.nodes[3].next = result.nodes[4];
//        result.nodes[4].previous = result.nodes[3];
//        result.nodes[4].next = null;
//        return head;
        Node[] nodes = result.nodes;
        int n = nodes.length;

        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
            nodes[i + 1].previous = nodes[i];
        }

        return nodes[0];
    }

    public static Node getNodeWithData(Node head, int nodeData){
        while(head!=null){
            if(head.data == nodeData) break;
            else head = head.next;
        }
        return head;
    }

    public static Node getNodeWithPosition(Node head, int position){
        int count =0;
        while(head!=null){
            if(position == count) break;
            else head = head.next;
            count++;
        }
        return head;
    }

    public static Node getLastNode(Node head){
        while (head.next!=null) head = head.next;
        return head;
    }

    public static Node setNode(Node head, int data, int position){
        int count =0;
        while (head!=null){
            if(count == position) {
                head.data = data;
                break;
            }
            count++;
            head = head.next;
        }
        return head;
    }

    //Need to fix this and traversal(Node head, int pos) at line 147 for creating branches from a single linked list :: "--<=="
    public static void attachTwoLinkedListsForward(Node ref, Node attach, int position){
        Node targetNode = getNodeWithPosition(ref, position);
        targetNode.anotherNext = attach;
        attach.previous = targetNode;
    }

    //Mearging two linked list :: "===>---"
    public static void attachTwoLinkedListBackwards(Node ref, Node attach, int position){
        Node targetNode = getNodeWithPosition(ref, position);
        Node lastAttachNode = getLastNode(attach);
        lastAttachNode.next = targetNode;
        targetNode.anotherPrevious = lastAttachNode;
    }

    private static Result getTestData(int[] elements) {
        if(elements == null || elements.length ==0){
            Node n1 =  new Node(10);
            Node n2 =  new Node(20);
            Node n3 =  new Node(30);
            Node n4 =  new Node(40);
            Node n5 =  new Node(50);
            return new Result(new Node[] {n1,n2,n3,n4,n5});
        }
        Node[] nodes = new Node[elements.length];
        for (int i = 0; i < elements.length; i++) {
            nodes[i] = new Node(elements[i]);
        }
        Result result = new Result(nodes);
        return result;
    }

    private record Result(Node[] nodes) {
    }

    public static Node getCircularLinkedList(int[] elements){
        Result result = getTestData(null);

//        Node head = result.nodes[0];
//        result.nodes[0].previous = result.nodes[4];
//        result.nodes[0].next = result.nodes[1];
//        result.nodes[1].previous = result.nodes[0];
//        result.nodes[1].next = result.nodes[2];
//        result.nodes[2].previous = result.nodes[1];
//        result.nodes[2].next = result.nodes[3];
//        result.nodes[3].previous = result.nodes[2];
//        result.nodes[3].next = result.nodes[4];
//        result.nodes[4].previous = result.nodes[3];
//        result.nodes[4].next = result.nodes[0];
//        return head;
        Node[] nodes = result.nodes;
        int n = nodes.length;
        for (int i = 0; i < n; i++) {
            nodes[i].previous = nodes[(i + n - 1) % n];
            nodes[i].next = nodes[(i + 1) % n];
        }

        return nodes[0];
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

    public static int traversal(Node head, int pos){
        int count = 0;
        while (null != head){
//            if(pos != -1 && pos == count) head = head.anotherNext;
//            else
                System.out.print(head.data+" ");
                head = head.next;
            count++;
        }
        System.out.println();
        return count;
    }

    public static boolean isEqual(Node head1, Node head2){
        while (head1!= null && head2!= null){
            if(head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
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
