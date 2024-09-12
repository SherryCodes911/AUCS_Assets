package DSA_Lab_03;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node() {
            this.next = null;
        }
    }

    private Node head;

    LinkedList() {
        this.head = null;
    }

    void traverse() {
        Node currNode = this.head;
        int i = 0;
        if (this.head == null) {
            System.out.println("Singly LinkedList is empty can't traverse");
            return;
        }
        System.out.println("\nPrinting list\n");
        while (currNode != null) {
            System.out.println("Singly LinkedList " + (i + 1) + " Element is " + currNode.data);
            currNode = currNode.next;
            i++;
        }
        System.out.println();
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
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

        Node curNode = this.head;
        int i = 0;
        while (i != index - 2) {
            curNode = curNode.next;
            i++;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = curNode.next;
        curNode.next = newNode;
        System.out.println(data + " inserted at " + index + " index");

    }

    void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (this.head == null) {
            newNode.next = head;
            System.out.println("List is Empty can't insert at end. "
                    + data + " inserted successfully but on head");
            return;
        }

        Node cuNode = this.head;
        Node tempNode = this.head;
        while (tempNode != null) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        cuNode.next = newNode;
        newNode.next = null;
        System.out.println(data + " inserted at tail successfully");

    }

    void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("Singly LinkedList is empty can't delete");
            return;
        }
        Node tempNode = this.head;
        this.head = head.next;
        System.out.println(
                "Head Node deleted successfully from Singly Linkedlist. Value of deleted node is: " + tempNode.data);
        tempNode = null;
    }


    void deleteAtIndex(int index){
        if (this.head == null) {
            System.out.println("List is empty can't delete at index " + index);
            return;
        }

        if (index < 2) {
            System.out.println("Invalid index can't delete at index " + index);
            return;
        }

        int i = 0;
        Node cuNode = this.head;
        Node temNode = this.head;
        while (i != index - 1) {
            cuNode = temNode;
            temNode = temNode.next;
        }
        cuNode.next = temNode.next;
        System.out.println(temNode + " deleted at index " + index);
        temNode = null;
    }

    void deleteAtEnd() {

        if (this.head == null) {
            System.out.println("List is Empty can't delete tail node");
            return;
        }

        Node cuNode = this.head;
        Node tempNode = this.head;
        while (tempNode.next != null) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data + " deleted at tail successfully");
        cuNode.next = null;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 10; i >= 1; i--) {
            list.insertAtBeginning(i);
        }
        list.traverse();
        list.deleteAtBeginning();
        list.traverse();
        list.insertAtEnd(100);
        list.traverse();

        list.deleteAtEnd();
        list.traverse();
        list.insertAtIndex(200, 4);
        list.traverse();
        list.deleteAtIndex(4);
        list.traverse();

    }

}
