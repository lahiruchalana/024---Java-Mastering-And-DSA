package testdatatree;

public class AgeTree {

    AgeNode root;

    private AgeNode addRecursive(AgeNode current, int age) {
        if (current == null) {
            return new AgeNode(age);
        }

        if (age < current.age) {
            current.left = addRecursive(current.left, age);
        }

        if (age > current.age) {
            current.right = addRecursive(current.right, age);
        }

        else {
            return current;
        }

        return current;
    }

    public void addAge(int age) {
        root = addRecursive(root, age);
    }

}
