package binarytree;

public class BinaryTree {

    Node root;

    /** implemented the tree implementing function **/
    public Node addRecursive(Node root, int value) {
        if ( root == null ) {
            return new Node(value);
        }

        if ( value < root.value ) {
            /**
             * root.left get a Node(value) from addRecursive(root.left, value) - There can have more recursions
             * **/
            root.left = addRecursive(root.left, value);
        }

        if ( value > root.value ) {
            /**
             * root.right get a Node(value) from addRecursive(root.right, value) - There can have more recursions
             * **/
            root.right = addRecursive(root.right, value);
        }

        else {
            return root;
        }

        return root;
    }

    public void addValue(int value) {
        root = addRecursive(root, value);
    }
}
