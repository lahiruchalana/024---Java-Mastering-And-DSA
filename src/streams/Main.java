package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(25);
        integerList.add(56);
        integerList.add(6);
        integerList.add(0);
        integerList.add(58);
        integerList.add(0);
        integerList.add(69);
        integerList.add(0);

        integerList.forEach(num -> {
            System.out.println(num);
        });
        System.out.println(integerList);

        List<Integer> integersOfZero = integerList.stream()
                .filter(num -> num.equals(0))
                .toList();

        System.out.println(integersOfZero);

        List<Integer> integersOfRest = integerList.stream()
                .filter(num -> !num.equals(0))
                .toList();

        System.out.println(integersOfRest);

        List<Integer> answer = new ArrayList<>();
        answer.addAll(integersOfZero);
        answer.addAll(integersOfRest);

        System.out.println(answer);

        List<Integer> answerSorted = answer.stream()
                .sorted()
                .toList();

        System.out.println(answerSorted);

    }
}
