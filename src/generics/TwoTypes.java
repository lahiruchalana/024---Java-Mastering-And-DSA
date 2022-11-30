package generics;

public class TwoTypes<T, V> {

    T valueOne;
    V valueTwo;

    public TwoTypes(T valueOne, V valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public void getValues() {
        System.out.println(valueOne);
        System.out.println(valueTwo);
    }

    public static void main(String[] args) {
        TwoTypes<Dog, Integer> twoTypes = new TwoTypes<>(new Dog("Lassy"), 458);
        twoTypes.getValues();
    }
}
