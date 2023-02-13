package binarytree;

public class Traverse {

    public static void getInOrderTraverse(Node node) {
        if ( node != null ) {
            getInOrderTraverse(node.left);
            System.out.print(" " + node.value);
            getInOrderTraverse(node.right);
        }
    }
}
