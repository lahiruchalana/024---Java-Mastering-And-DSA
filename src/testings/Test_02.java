package testings;

import java.util.Optional;

public class Test_02 {

    public static void main(String[] args) {
        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

//        System.out.println(optional.get());

        if (optional.isEmpty()) {
            System.out.println("Empty");
        }

        System.out.println(optional.orElse("No data"));
    }
}
