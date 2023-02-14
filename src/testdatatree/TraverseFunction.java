package testdatatree;

public class TraverseFunction {

    public static void inOrderTraverse(AgeNode current) {
        if (current != null) {
            inOrderTraverse(current.left);
            System.out.print(" " + current.age);
            inOrderTraverse(current.right);
        }
    }

}
