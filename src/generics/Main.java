package generics;

public class Main {

    public static void main(String[] args) {

        // using generics print an Integer objects
        Print<Integer> integerPrint = new Print<>(23);
        integerPrint.printValue();

        // Print<int> intPrint = new Print<>(89); // cannot perform because int is not an object type, it's a primitive data type.

        Print<Dog> dogPrint = new Print<>(new Dog("Doggy"));
        dogPrint.printValue();

        Print<Dog> dogPrint1 = new Print<>(new Dog("Lassy"));
        dogPrint1.printValue();

        // PrintExtend<Integer> printExtend = new PrintExtend<Integer>(); // this will not work, because the PrintExtend extends from the Animal class
        // so only animal class's child class can be replaced as the T (generic only child classes)

        PrintExtend<Dog> dogPrintExtend = new PrintExtend<>(new Dog("lassy"));
        System.out.println(dogPrintExtend);

    }
}
