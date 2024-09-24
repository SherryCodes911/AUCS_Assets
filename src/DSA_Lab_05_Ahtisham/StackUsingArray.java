package DSA_Lab_05_Ahtisham;

/**
 * Task 01: Implement a stack using an array with the following methods:
 * ● push(int data): Adds an element to the top of the stack.
 * ● pop(): Removes and returns the top element from the stack.
 * ● peek(): Returns the top element without removing it.
 * ● isEmpty(): Checks if the stack is empty.
 * ● size(): Returns the number of elements in the stack.
 * Instructions:
 * ● Define a fixed capacity for your array (for example 5).
 * ● Handle edge cases such as stack overflow (when the array is full) and stack underflow
 * (when trying to pop from an empty stack).
 * ● Write a main method to test all the stack operations by pushing and popping elements,
 * and printing the stack after each operation.
 */
class ArrayStack {
    private final int[] arr;
    private int top;
    private final int size;

    public ArrayStack(int size) {
        this.size = size;
        arr = new int[this.size];
        top = -1;

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full can't be pushed!");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " is pushed into the stack!");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty can't be popped! ");
            return -1;
        }
        int x = arr[top];
        arr[top--] = 0;
        System.out.print("Popped from the stack! Popped value is: ");
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty can't be peeked!");
            return -1;
        }
        return arr[top];
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    public int getSize() {
        System.out.print("Stack size: ");
        return size;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty can't be displayed!");
            return;
        }
        System.out.println("\nDisplaying Stack\n");
        for (int i = top; i >= 0; i--) {
            System.out.println("Stack " + (i + 1) + " element is " + arr[i]);
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.isFull());
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
