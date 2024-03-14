package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node head = getDoublyLinkList();

        insert(40, head, 2);
        delete(head, 2);
        traversal(head);
    }

    public static Node getDoublyLinkList() {
        Result result = getResult();

        Node head = result.n1();
        result.n1().next = result.n2();
        result.n2().previous = result.n1();
        result.n2().next = result.n3();
        result.n3().previous = result.n2();
        result.n3().next = result.n4();
        result.n4().previous = result.n3();
        result.n4().next = result.n5();
        result.n5().previous = result.n4();
        result.n5().next = null;
        return head;
    }

    private static Result getResult() {
        Node n1 =  new Node(10);
        Node n2 =  new Node(20);
        Node n3 =  new Node(30);
        Node n4 =  new Node(40);
        Node n5 =  new Node(50);
        Result result = new Result(n1, n2, n3, n4, n5);
        return result;
    }

    private record Result(Node n1, Node n2, Node n3, Node n4, Node n5) {
    }

    public static Node getCircularLinkedList(){
        Result result = getResult();
        Node head = result.n1();

        result.n1.previous = result.n5();
        result.n1().next = result.n2();
        result.n2().previous = result.n1();
        result.n2().next = result.n3();
        result.n3().previous = result.n2();
        result.n3().next = result.n4();
        result.n4().previous = result.n3();
        result.n4().next = result.n5();
        result.n5().previous = result.n4();
        result.n5().next = result.n1;
        return head;
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

    public static void traversal(Node head){
        while (head!=null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println();
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
