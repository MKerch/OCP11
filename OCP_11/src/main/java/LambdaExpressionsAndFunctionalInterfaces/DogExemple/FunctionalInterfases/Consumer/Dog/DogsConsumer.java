package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DogsConsumer {


    public static void main(String[] args) {
        //andThen
        List<Dog> dogs = new ArrayList<>();
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);
        Dog zooey = new Dog("zooey", 45, 8);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(zooey);

        //Consumer<Dog> displayName = d -> System.out.print(d + " ");
        //dogs.forEach(displayName);
        //dogs.forEach(displayName.andThen(d -> d.bark()));
        Consumer<Dog> displayName = d -> System.out.println(d + " ");
        Consumer<Dog> doBark = d -> d.bark();
        dogs.forEach(displayName.andThen(doBark));
        // next is compile error
        // dogs.forEach((d->System.out.print(d + " ")).andThen(d->d.bark()));
    }

}
