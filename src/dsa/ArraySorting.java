package dsa;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {15, 56, 1, 58, 25, 6, 99};

//        // using method of sort in Arrays class
//        Arrays.sort(myArray);
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("using for loops, without using Arrays class sort method");

        for (int i = 0; i < myArray.length; i++) {

            for(int j = i + 1; j < myArray.length; j++) {

                int temp = 0;
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // insertion array
        Integer[] array = new Integer[13];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // updating array
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == 10 ) {
                array[i] = 255;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
