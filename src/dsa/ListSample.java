package dsa;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);

        System.out.println(list);

        // insert data
        for ( int i = 0; i < 12; i++) {
            list.add( i * 10 );
        }

        System.out.println(list);
    }

}
