package binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        System.out.println("binaryTree started to implement!!");

        binaryTree.addValue(32);
        binaryTree.addValue(54);
        binaryTree.addValue(87);
        binaryTree.addValue(45);
        binaryTree.addValue(22);
        binaryTree.addValue(13);
        binaryTree.addValue(15);
        binaryTree.addValue(99);
        binaryTree.addValue(9);

        System.out.println("binaryTree ended the implementation!!");

        System.out.println("-------------------------------------");

        Traverse.getInOrderTraverse(binaryTree.root);
    }
}
