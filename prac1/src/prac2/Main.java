package prac2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> input = new ArrayList<>();
        input.add(new Human(20, "Ab", "Za", LocalDate.of(1914, 7, 28), 80));
        input.add(new Human(18, "Qa", "Ff", LocalDate.of(2022, 8, 28), 10));
        input.add(new Human(68, "Tt", "Pp", LocalDate.of(1988, 10, 18), 40));
        input.add(new Human(99, "Yy", "Oo", LocalDate.of(1904, 6, 11), 58));
        input.add(new Human(30, "Vv", "Ll", LocalDate.of(1954, 3, 20), 70));
        Stream<Human> stream = input.stream();
        stream.sorted(Comparator.comparing(Human::getSecondLetterOfName))
                .filter(human -> human.getWeight() % 10 == 0)
                .forEach(System.out::println);
        System.out.println("-------------------");
        Stream<Human> stream1 = input.stream();
        stream1.sorted(Comparator.comparing(Human::getWage))
                .forEach(System.out::println);
        System.out.println("-------------------");
        Stream<Human> stream2 = input.stream();
        System.out.println(stream2.map(x -> x.getWeight()).reduce((a, b) -> a * b).get());

    }
}

