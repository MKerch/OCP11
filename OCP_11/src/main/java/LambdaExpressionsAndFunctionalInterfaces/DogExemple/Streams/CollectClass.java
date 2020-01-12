package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer.Dog.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectClass {


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

        List<Dog> dogList = dogs.stream()
                .filter(d -> d.getWeight() >= 50)
                .collect(Collectors.toList());//Collect the dogs into a new List

        dogList.forEach(System.out::println);
    }
}