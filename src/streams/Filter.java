package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Filter {

    public static void main(String[] args) {

        // for integer array filter
        // filter even numbers
        Integer[] nums = new Integer[]{58, 59, 2, 1, 78, 55, 89};
        Object[] numsEven = Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .toArray();
        // Arrays.stream(numsEven).forEach(num -> System.out.println(num));
        Arrays.stream(numsEven).forEach(System.out::println);

        // filter odd numbers to a List
        List<Integer> numList = Arrays.stream(nums)
                .filter(num -> num % 2 == 1)
                .toList();
        System.out.println(numList);

        // get Max of numList
        Integer maxNum = numList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maxNum);

        // get min value in numList
        Integer minNum = numList.stream()
                .min(Integer::compare)
                .get();
        System.out.println(minNum);

        // using PersonPopulate Class and get the List of Persons and find max value of them
        Optional<Person> maxAgedPerson = PersonPopulate.getPersonPopulate()
                .stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(maxAgedPerson.toString());
    }
}
