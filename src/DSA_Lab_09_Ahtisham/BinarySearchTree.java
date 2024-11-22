package DSA_Lab_09_Ahtisham;

import java.util.LinkedList;
import java.util.Queue;
/*
Part 01: Create a Binary Search Tree Class
Step 1: Implement a Node Class
● Define a class Node with:
        ○ int value (value of the node).
        ○ Node left (pointer to the left child).
        ○ Node right (pointer to the right child).
Step 2: Implement a BST Class
● Define a class BinarySearchTree with:
        ○ A Node root (the root of the tree).
        ○ A method void insert(int value) to add elements to the BST:
        ■ Insert elements while maintaining BST properties (values smaller than the
        current node go to the left, values larger go to the right).
        ○ A method int countNodes() to calculate and return the total number of
nodes in the BST.
        ○ A method boolean search(int value) to search for a value in the BST.
        Part 2: Implement Traversals
Implement the following traversal methods:
        1. In-order Traversal: Left → Root → Right (used to retrieve sorted order).
        2. Pre-order Traversal: Root → Left → Right.
3. Post-order Traversal: Left → Right → Root.
4. Level-order Traversal: Traverse the tree level by level using a queue.
        Part 3: Testing the Binary Search Tree
Insertion Test
1. Insert at least 7-10 elements into the BST. For example:
        50, 30, 20, 40, 70, 60, 80.
        2. After inserting each element, print the total number of nodes in the BST using
countNodes().
Search Test
1. Search for specific values (e.g., 20, 60, 90) in the BST using the search() method.
2. Print whether the value exists in the tree.
Traversal Tests
1. After inserting all elements, perform all four traversals.
2. Display the results of each traversal:
        ○ In-order Traversal (should print the elements in sorted order).
        ○ Pre-order Traversal.
        ○ Post-order Traversal.
        ○ Level-order Traversal.
*/

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    private Node root;
    int size;

    public int getSize() {
        return size;
    }

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            System.out.println(data + " is inserted at root");
            this.size++;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                if (parent.left == null) {
                    parent.left = new Node(data);
                    System.out.println(data + " is inserted at left");
                    this.size++;
                    return;
                }
            } else if (data > current.data) {
                current = current.right;
                if (parent.right == null) {
                    parent.right = new Node(data);
                    System.out.println(data + " is inserted at right");
                    this.size++;
                    return;
                }
            } else {
                System.out.println(data + " can't insert already exist");
                return;
            }


        }

    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public void search(Node node, int data) {
        if (node == null) {
            System.out.println("\n" + data + " not found");
            return;
        }
        if (node.data == data) {
            System.out.println("\n" + data + " found");
            return;
        }
        if (data < node.data)
            search(node.left, data);

        search(node.right, data);
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Number of Nodes in Binary Search Tree " + tree.getSize());

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(-60);
        tree.insert(-70);
        tree.insert(9);
        tree.insert(1);
        tree.insert(1);
        System.out.println("Number of Nodes in Binary Search Tree " + tree.getSize());
        System.out.println("\n\nPre Order Traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println("\n\nInOrder Traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println("\n\nPostOrder Traversal");
        tree.postOrderTraversal(tree.root);
        tree.search(tree.root, 10);

        System.out.println("\n\nLevel Order Traversal");
        tree.levelOrderTraversal();

    }
}
