package DSA_Lab_07_Ahtisham;
class Node{
    String data;
    Node[] children;
    int numberOfChildren;
    public Node(String data, int numberOfChildren){
        this.data = data;
        this.numberOfChildren = numberOfChildren;
        children = new Node[this.numberOfChildren];
    }
}

public class Tree {
    private Node root;
    public Tree(String data, int numberOfChildren){
        this.root = new Node(data, numberOfChildren);
        System.out.println("Tree created");
    }
    public void insert(Node child){
    
    }
    public static void main(String[] args) {
    Tree tree = new Tree("A", 2);

    }
}
