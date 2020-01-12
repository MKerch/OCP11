package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainSorting {


//    public static void main(String[] args) {
//        Stream.of("Jerry", "George", "Kramer", "Elane").sorted()
//                .forEach(System.out::println);
//    }

//    public static void main(String[] args) {
//
//        List<Duck> ducks = Arrays.asList(
//                new Duck("Jerry", "yellow", 3),
//                new Duck("George", "brown", 4),
//                new Duck("Kramer", "mottled", 6),
//                new Duck("Elaine", "white", 2)
//        );

//        ducks.stream()
//                .sorted()//sorts ducks by name (implements comparable interface)
//                .forEach(System.out::println);

//        ducks.stream()
//                .sorted((d1, d2) -> d1.getAge() - d2.getAge())   //sorts ducks by age
//                .forEach(System.out::println);

//        Comparator<Duck> byAgeLambda = (d1, d2) -> d1.getAge() - d2.getAge();
//        ducks.stream().sorted(byAgeLambda)
//                .forEach(System.out::println);

    // }

//    public static void main(String[] args) {
//
//        List<Duck> ducks = Arrays.asList(
//                new Duck("Jerry", "yellow", 3),
//                new Duck("George", "brown", 4),
//                new Duck("Kramer", "mottled", 6),
//                new Duck("Elaine", "white", 2),
//                new Duck("Jerry", "mottled", 10),
//                new Duck("George", "white", 12),
//                new Duck("Kramer", "brown", 11),
//                new Duck("Elaine", "brown", 13)
//        );
//
//        Comparator<Duck> byColor = Comparator.comparing(Duck::getColor);
//        Comparator<Duck> byName = Comparator.comparing(Duck::getName);
//        Comparator<Duck> byAge = Comparator.comparing(Duck::getAge);
//
////        ducks.stream().sorted(byAge).forEach(System.out::println);
////        ducks.stream().sorted(byAge.reversed()).forEach(System.out::println);
//
////        ducks.stream().sorted(byName.thenComparing(byAge))
////                .forEach(System.out::println);
//
//        ducks.stream().sorted(byColor.thenComparing(byAge))
//                .forEach(System.out::println);
//
//    }

//    public static void main(String[] args) {
//        List<Duck> ducks = Arrays.asList(
//                new Duck("Jerry", "yellow", 3),
//                new Duck("George", "brown", 4),
//                new Duck("Kramer", "mottled", 6),
//                new Duck("Elaine", "white", 2),
//                new Duck("Huey", "mottled", 2),
//                new Duck("Louie", "white", 4),
//                new Duck("Dewey", "brown", 6)
//        );
//
//        ducks.stream()
//                .map(d->d.getColor())
//                .distinct()
//                .forEach(System.out::println);
//    }

}
