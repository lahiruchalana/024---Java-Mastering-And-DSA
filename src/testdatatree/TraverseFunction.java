package testdatatree;

public class TraverseFunction {

    public static void inOrderTraverse(AgeNode current) {
        if (current != null) {
            inOrderTraverse(current.left);
            System.out.print(" " + current.age);
            inOrderTraverse(current.right);
        }
    }

    public static void backOrderTraverse(AgeNode current) {
        if (current != null) {
            backOrderTraverse(current.right);
            System.out.print(" " + current.age);
            backOrderTraverse(current.left);
        }
    }

    public static void preOrderTraverse(AgeNode current) {
        if (current != null) {
            System.out.print(" " + current.age);
            preOrderTraverse(current.left);
            preOrderTraverse(current.right);
        }
    }

    public static void postOrderTraverse(AgeNode current) {
        if (current != null) {
            postOrderTraverse(current.left);
            postOrderTraverse(current.right);
            System.out.print(" " + current.age);
        }
    }
}
