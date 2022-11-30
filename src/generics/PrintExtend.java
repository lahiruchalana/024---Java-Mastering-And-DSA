package generics;

public class PrintExtend<T extends Animal> {

    T name;

    public PrintExtend(T name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
