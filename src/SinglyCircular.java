class Node {

    private final int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public int getData() {
        return data;
    }
}


public class SinglyCircular {
    private Node head;
    private Node tail;
    private int count;

    public int getCount() {
        System.out.print("Nodes in LinkedList: ");
        return count;
    }

    SinglyCircular() {
        this.head = null;
        this.tail = null;
    }


    void traverse() {

        if (this.head == null) {
            System.out.println("Singly LinkedList is empty can't traverse");
            return;
        }
        System.out.println("\nPrinting list\n");
        Node currNode = this.head;
        int i = 0;
        do {
            System.out.println("Singly LinkedList " + (i + 1) + " Element is " + currNode.getData());
            currNode = currNode.next;
            i++;

        } while (currNode != head);
        System.out.println();
    }

    void search(int data) {
        if (this.head == null) {
            System.out.println("List is empty can't search " + data);
            return;
        }
        Node currNode = this.head;
        int index = 0;
        do {
            if (currNode.getData() == data) {
                System.out.println("Element " + currNode.getData() + " found at position " + (index + 1));
                return;
            }
            currNode = currNode.next;
            index++;
        }while (currNode != head);
        System.out.println("Element " + data + " not found");
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            head = newNode;
            tail = newNode;

        } else {

            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        this.count++;
        System.out.println(data + " inserted at head successfully");


    }

    void insertAtIndex(int data, int index) {
        if (this.head == null) {
            System.out.println("Circular List is empty can't insert at " + index + " index");
            return;
        }

        if (index < 2) {
            System.out.println("Invalid index can't insert at index " + index + " Circular LinkedList");
            return;
        }

        Node curNode = this.head;
        int i = 0;
        while (i != index - 2) {
            curNode = curNode.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = curNode.next;
        curNode.next = newNode;
        this.count++;
        System.out.println(data + " inserted at " + index + " index");

    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            System.out.println("List is Empty can't insert at end. "
                    + data + " inserted successfully but on head");
            return;
        }

        Node cuNode = this.head;
        Node tempNode = this.head.next;
        while (tempNode != head) {
            cuNode = tempNode;
            tempNode = tempNode.next;
        }
        cuNode.next = newNode;
        newNode.next = head;
        this.count++;
        System.out.println(data + " inserted at tail successfully");

    }

    void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("Singly Circular LinkedList is empty can't delete");
            return;
        }
        Node tempNode = this.head;
        this.head = head.next;
        this.tail.next = head;
        this.count--;
        System.out.println(
                "Head Node deleted successfully from Singly Linked list. Value of deleted node is: " + tempNode.getData());
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
        this.tail.next = head;
        this.count--;
        System.out.println(temNode.getData() + " deleted at index " + index);
//        temNode = null;
    }

    void deleteAtEnd() {

        if (this.head == null)
            System.out.println("List is Empty can't delete tail node");

        else {
            Node cuNode = this.head;
            Node tempNode = this.head;
            while (tempNode.next != head) {
                cuNode = tempNode;
                tempNode = tempNode.next;
            }
            this.count--;
            System.out.println(tempNode.getData() + " deleted at tail successfully");
            cuNode.next = head;
        }


    }

    public static void main(String[] args) {
        SinglyCircular list = new SinglyCircular();

        System.out.println(list.getCount());
        for (int i = 10; i > 0; i--) {
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

        list.search(10);
    }

}
