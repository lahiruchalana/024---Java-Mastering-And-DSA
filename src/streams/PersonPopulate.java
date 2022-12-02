package streams;

import java.util.ArrayList;
import java.util.List;

public class PersonPopulate {

    public static List<Person> getPersonPopulate() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Lahiru", "Colombo", 23, 3.2));
        personList.add(new Person(2, "Kasun", "Sydney", 25, 2.2));
        personList.add(new Person(3, "Isuru", "singapore", 24, 3.1));
        personList.add(new Person(4, "Pawani", "Los Angeles", 26, 3.5));
        personList.add(new Person(5, "Shashini", "London", 22, 3.9));
        personList.add(new Person(6, "Imasha", "Shanghai", 22, 2.1));
        personList.add(new Person(7, "Padmila", "Tokyo", 19, 3.9));
        personList.add(new Person(8, "Maldeniya", "Oklahoma", 32, 3.8));

        return personList;
    }

}
