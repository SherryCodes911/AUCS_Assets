package DSA_Lab_06_Ahtisham;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public int getSize() {
        return size;
    }

    public QueueUsingLinkedList() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }


    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            front = rear = newNode;
        else {
            this.rear.next = newNode;
            rear = newNode;
        }
        this.size++;
        System.out.println(data + " Enqueue in Queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.print("Queue is Empty can't Dequeue");
            return -1;
        }
        Node temp = this.front;
        int data = this.front.data;
        this.front = this.front.next;
        this.size--;
        temp.next = null;
        System.out.print("Dequeue Successfully. Dequeue element is ");
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Queue is Empty can't peek");
            return -1;
        }
        System.out.print("Queue peek element is ");
        return front.data;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is Empty can't traverse");
            return;
        }
        System.out.println("\nTraversing Queue\n");
        Node temp = front;
        int i = 0;
        while (temp != null) {
            System.out.println("Queue " + (++i) + " element is " + temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        queue.traverse();
        System.out.println("Elements in Queue : " + queue.getSize());


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Elements in Queue : " + queue.getSize());

        queue.traverse();
        System.out.println(queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Elements in Queue : " + queue.getSize());

        System.out.println(queue.dequeue());
        queue.enqueue(100);
        System.out.println(queue.peek());
        queue.traverse();


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.traverse();


    }
}
