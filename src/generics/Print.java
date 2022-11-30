package generics;

public class Print<T> {

    T value;

    public Print(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }
}
