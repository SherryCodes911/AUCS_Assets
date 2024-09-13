package DSA_Lab03_Ahtisham;

class Node {
    int data;
    Node next;

    Node() {
        this.next = null;
    }
}

public class LinkedList {

    private Node head;
    private int count;

    public int getCount() {
        System.out.print("Nodes in LinkedList: ");
        return count;
    }

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

    void search(int data) {
        if (this.head == null) {
            System.out.println("List is empty can't search " + data);
            return;
        }
        Node currNode = this.head;
        int index = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                System.out.println("Element " + currNode.data + " found at position " + (index + 1));
                return;
            }
            currNode = currNode.next;
            index++;
        }
        System.out.println("Element " + data + " not found");
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
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
        this.count++;
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
        this.count++;
        System.out.println(data + " inserted at tail successfully");

    }

    void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("Singly LinkedList is empty can't delete");
            return;
        }
        Node tempNode = this.head;
        this.head = head.next;
        this.count--;
        System.out.println(
                "Head Node deleted successfully from Singly Linked list. Value of deleted node is: " + tempNode.data);
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


        Node cuNode = this.head;
        Node temNode = this.head;
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

        Node cuNode = this.head;
        Node tempNode = this.head;
        while (tempNode.next != null) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        this.count--;
        System.out.println(tempNode.data + " deleted at tail successfully");
        cuNode.next = null;

    }

    void reverse() {
        if (this.head == null) {
            System.out.println("List is empty, nothing to reverse.");
            return;
        }

        Node prev = null;
        Node current = this.head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Save the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move prev to current
            current = next;       // Move current to next
        }

        this.head = prev;  // Update the head to the new front (last node)
        System.out.println("LinkedList reversed successfully.");
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

        System.out.println(list.getCount());

        list.search(2);

        list.reverse();
        list.traverse();
    }

}
