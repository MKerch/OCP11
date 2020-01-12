package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainSearching {


//    public static void main(String[] args) {
//
//        List<Dog> dogs = new ArrayList<>();
//        Dog boi = new Dog("boi", 30, 6);
//        Dog clover = new Dog("clover", 35, 12);
//        Dog aiko = new Dog("aiko", 50, 10);
//        Dog zooey = new Dog("zooey", 45, 8);
//        Dog charis = new Dog("charis", 120, 7);
//        dogs.add(boi);
//        dogs.add(clover);
//        dogs.add(aiko);
//        dogs.add(zooey);
//        dogs.add(charis);


//        boolean cNames = dogs.stream().filter(d -> d.getWeight() > 50)
//                .anyMatch(d -> d.getName().startsWith("c"));
//        System.out.println("Are there any dogs > 50 pounds whose name starts 'c' " + cNames);

//        boolean isOlder = dogs.stream().mapToInt(d -> d.getAge())
//                .allMatch(a -> a > 5); //do all dogs have an age >5?
//        System.out.println("Are all the dogs age older than 5? " + isOlder);

//        boolean red = dogs.stream().map(d -> d.getName())
//                .noneMatch(n -> n.equals("red"));
//        System.out.println("Non of the dogs are red " + red);


    // }


    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);
        Dog aiko = new Dog("aiko", 50, 10);
        Dog zooey = new Dog("zooey", 45, 8);
        Dog charis = new Dog("charis", 120, 7);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(aiko);
        dogs.add(zooey);
        dogs.add(charis);

//        Optional<Dog> any = dogs.stream()
//                .filter(d -> d.getWeight() > 50)
//                .filter(d -> d.getName()
//                        .startsWith("c")).findAny();
//        any.ifPresent(System.out::println);

//        Optional<Dog> any = dogs.stream()
//                .filter(d -> d.getAge() > 5)
//                .findAny();
//        any.ifPresent(System.out::println);

//        Optional<Dog> any = dogs.stream()
//                .filter(d -> d.getAge() > 5)
//                .peek(System.out::println)
//                .findAny();
//        any.ifPresent(System.out::println);


    }
}
