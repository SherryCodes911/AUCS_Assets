package DSA_Lab03_Ahtisham;

/**
 * You will implement a doubly linked list in Java (or any other programming language of your
 * choice).
 * Perform the following tasks, ensuring each method works correctly and efficiently.
 * Node Structure Implementation
 *  Define a Node class that will represent each element in the linked list.
 *  Each Node should contain an integer data field and a reference to the next and prev nodes
 * in the list.
 * Doubly Linked List Class
 *  Create a doubly LinkedList class that will contain the following operations:
 * a) Insertion Operations:
 *  Insert at Start: Write a method addAtStart(int data) that inserts a new node at the start of
 * the linked list.
 *  Insert at End: Write a method addAtEnd(int data) that inserts a new node at the end of
 * the linked list.
 *  Insert at Position: Write a method addAtPosition(int data, int position) that inserts a new
 * node at a specific position in the list. If the position is invalid (greater than the length of
 * the list), print an appropriate message.
 * b) Deletion Operations:
 * Delete from Start: Write a method deleteFromStart() that deletes the first node of the linked list.
 * Delete from End: Write a method deleteFromEnd() that deletes the last node of the linked list.
 * Delete by Value: Write a method deleteByValue(int data) that deletes the first occurrence of a
 * node with the given value from the linked list. If the value is not found, print an appropriate
 * message.
 * c) Traversal Operations:
 *  Display List: Write a methods displayFromStart() and displayFromEnd() that traverses
 * the linked list and prints each node’s data.
 * d) Search Operation:
 *  Search for a Value: Write a method search(int value) that searches for a node with the
 * given value in the linked list. If found, print the position (0-based index), otherwise print
 * "Value not found."
 * e) Reverse the List: Write a method reverse() that reverses the linked list.
 * f) Count Nodes: Write a method countNodes() that returns the total number of nodes in the
 * linked list.
 * Testing and Validation:
 *  Implement a main method where you:
 *  Insert nodes at both the start and end of the list.
 *  Insert nodes at specific positions in the list.
 *  Delete nodes from both the start and end of the list.
 *  Search for values in the list.
 *  Display the list after each operation to verify correctness.
 */
class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

}

public class DoublyLinkedList {
    private DoublyNode head;
    private int count;

    public int getCount() {
        System.out.print("Nodes in Doubly LinkedList: ");
        return count;
    }

    DoublyLinkedList() {
        this.head = null;
    }


    void traverseForward() {
        DoublyNode currNode = this.head;
        if (this.head == null) {
            System.out.println("Doubly LinkedList is empty can't traverse");
            return;
        }
        int i = 0;
        System.out.println("\nPrinting list\n");
        while (currNode != null) {
            System.out.println("Doubly LinkedList " + (i + 1) + " Element is " + currNode.data);
            currNode = currNode.next;
            i++;
        }
        System.out.println();
    }

    void search(int data) {
        if (this.head == null) {
            System.out.println("List is empty can't search " + data);
            return;
        }

        DoublyNode currNode = this.head;
        int k = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                System.out.println("Element " + currNode.data + " found at position " + (k + 1));
                return;
            }
            currNode = currNode.next;
            k++;
        }
        System.out.println("Element " + data + " not found");
    }

    void insertAtBeginning(int data) {
        DoublyNode newNode = new DoublyNode();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = null;
        head = newNode;
        this.count++;
        System.out.println(data + " inserted at head successfully");

    }

    void insertAtIndex(int data, int index) {
        if (this.head == null) {
            System.out.println("List is empty can't insert at " + index + " index");
            return;
        }

        if (index < 2) {
            System.out.println("Invalid index can't insert at index " + index);
            return;
        }

        DoublyNode curNode = this.head;
        int i = 0;
        while (i != index - 2) {
            curNode = curNode.next;
            i++;
        }
        DoublyNode newNode = new DoublyNode();
        newNode.data = data;
        newNode.next = curNode.next;
        curNode.next = newNode;
        this.count++;
        System.out.println(data + " inserted at " + index + " index");

    }

    void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode();
        newNode.data = data;

        if (this.head == null) {
            newNode.next = head;
            System.out.println("List is Empty can't insert at end. "
                    + data + " inserted successfully but on head");
            return;
        }

        DoublyNode cuNode = this.head;
        DoublyNode tempNode = this.head;
        while (tempNode != null) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        cuNode.next = newNode;
        newNode.next = null;
        this.count++;
        System.out.println(data + " inserted at tail successfully");

    }

    void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("Doubly LinkedList is empty can't delete");
            return;
        }
        DoublyNode tempNode = this.head;
        this.head = head.next;
        this.head.prev = null;
        this.count--;
        System.out.println(
                "Head Node deleted successfully from Doubly Linked list. Value of deleted node is: " + tempNode.data);
//        tempNode = null; no need Java Garbage take care of it
    }


    void deleteAtIndex(int index) {
        if (this.head == null) {
            System.out.println("List is empty can't delete at index " + index);
            return;
        }

        if (index < 2) {
            System.out.println("Invalid index can't delete at index " + index);
            return;
        }


        DoublyNode cuNode = this.head;
        DoublyNode temNode = this.head;
        int i = 0;

        while (i != index - 1) {
            cuNode = temNode;
            temNode = temNode.next;
            i++;
        }
        cuNode.next = temNode.next;
        this.count--;
        System.out.println(temNode.data + " deleted at index " + index);
//        temNode = null;
    }

    void deleteAtEnd() {

        if (this.head == null) {
            System.out.println("List is Empty can't delete tail node");
            return;
        }

        DoublyNode cuNode = this.head;
        DoublyNode tempNode = this.head;
        while (tempNode.next != null) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        this.count--;
        System.out.println(tempNode.data + " deleted at tail successfully");
        cuNode.next = null;
//        tempNode = null;  No Need Java Garbage Collector Takes care of it

    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println(list.getCount());
        for (int i = 10; i >= 1; i--) {
            list.insertAtBeginning(i);
        }
        list.traverseForward();

        list.deleteAtBeginning();
        list.traverseForward();

        list.insertAtEnd(100);
        list.traverseForward();

        list.deleteAtEnd();
        list.traverseForward();
//        list.insertAtIndex(200, 4);
//        list.traverseForward();

//        list.deleteAtIndex(4);
//        list.traverseForward();

        System.out.println(list.getCount());

        list.search(2);
    }

}
