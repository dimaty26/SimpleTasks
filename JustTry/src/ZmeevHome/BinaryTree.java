package ZmeevHome;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else if (value == current.value) {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTree createBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(7);
        tree.add(4);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(4);

        return tree;
    }

}
