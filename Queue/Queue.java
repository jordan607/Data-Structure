package Queue;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T item){
        Node<T> newNode =  new Node<>(item);
        if(size == 0){
            front = newNode;
        }else rear.setNext(newNode);
        rear = newNode;
        size++;
    }

    public T dequeue(){
        if(size == 0) return null;
        T item = front.getData();
        front = front.getNext();
        size--;
        return item;
    }

    public T peek(){
        if(size == 0) return null;
        return front.getData();
    }

    public int size(){
        return size;
    }

    public void display(){
        if(size == 0) System.out.println("Queue is empty");
        else{
            Node<T> current =  front;
            while (current != null){
                System.out.print(current.getData());
                current = current.getNext();
            }
            System.out.println();
        }
    }
}
