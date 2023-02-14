package testdatatree;

public class PostAge {

    public static void main(String[] args) {
        AgeTree ages = new AgeTree();
        ages.addAge(3);
        ages.addAge(45);
        ages.addAge(12);
        ages.addAge(5);
        ages.addAge(89);
        ages.addAge(23);
        ages.addAge(22);
        ages.addAge(33);
        ages.addAge(2);
        ages.addAge(22); /** if age value already exist in the tree then age value will not add again to tree no duplication **/
        ages.addAge(89); /** if age value already exist in the tree then age value will not add again to tree no duplication **/

        System.out.println("InOrder Traverse in ages tree!!!");
        TraverseFunction.inOrderTraverse(ages.root);

        System.out.println();
        System.out.println("BackOrder Traverse in ages tree!!!");
        TraverseFunction.backOrderTraverse(ages.root);

        System.out.println();
        System.out.println("PreOrder Traverse in ages tree!!!");
        TraverseFunction.preOrderTraverse(ages.root);

        System.out.println();
        System.out.println("PostOrder Traverse in ages tree!!!");
        TraverseFunction.postOrderTraverse(ages.root);

        System.out.println();
    }

}
