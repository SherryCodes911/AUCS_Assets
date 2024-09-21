package DSA_Lab_05_Ahtisham;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }

}

public class StackUsingLinkedList {
    private Node top;

    boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(top.data + " pushed into Stack");

    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty can't pop ");
            return -1;
        }
        Node temp = top;
        int data = top.data;
        top = top.next;
        temp.next = null;
        System.out.print("Popped from the stack. Popped value is: ");
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Stack is empty can't peek ");
            return -1;
        }
        return top.data;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty can't be displayed!");
            return;
        }

        Node temp = top;
        int i = 0;
        System.out.println("\nDisplaying Stack (Top to Bottom)\n");
        while (temp != null) {
            System.out.println("Stack " + (i + 1) + " element is " + temp.data);
            i++;
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println(stack.peek());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.display();
    }
}
