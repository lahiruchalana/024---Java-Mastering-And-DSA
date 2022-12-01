package designpatterns;

public class SingletonClass {

    private static final SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }
}
