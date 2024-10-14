package DSA_Lab_06_Ahtisham;

public class QueueUsingArray {
    private int front, rear, size;
    private int[] arr;

    QueueUsingArray(int size) {
        this.size = size;
        arr = new int[this.size];
        front = -1;
        rear = -1;
    }

    public int getSize() {
        return arr.length;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full can't Enqueue");
            return;
        }
        if (isEmpty())
            front = 0;

        rear = (rear + 1) % size;
        arr[rear] = item;
        System.out.println(item + " Enqueued in Queue");

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.print("Queue is Empty can't Dequeue");
            return -1;
        }
        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else
            front = (front + 1) % size;

        System.out.println("Dequeued in Queue Successfully. Dequeue item is: ");
        return item;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Queue is Empty can't Peek");
            return -1;
        }
        System.out.print("Queue front element is: ");
        return arr[front];

    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

    }
}
