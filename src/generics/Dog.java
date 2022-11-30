package generics;

public class Dog extends Animal {

        String name;

        public Dog(String name) {
                this.name = name;
        }

        public void barking() {
                System.out.println("Dog is barking");
        }
}
