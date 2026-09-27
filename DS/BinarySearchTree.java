class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root = null;
    int count = 0;
    Boolean flag;

    public void add(int data) {
        add(root, data);
    }

    public Node add(Node n, int data) {
        if (n == null) {
            Node newNode = new Node(data);
            count++;
            return newNode;
        }
        if (n.data < data) {
            n.left = add(n.left, data);
        } else if (n.data > data) {
            n.right = add(n.right, data);
        } else {
            flag = false;
        }
        return n;
    }

    int size() {
        return count;
    }

    void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data);
        preOrder(n.left);
        preOrder(n.right);
    }
    

}

public class BinarySearchTree {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(10);
    }

}