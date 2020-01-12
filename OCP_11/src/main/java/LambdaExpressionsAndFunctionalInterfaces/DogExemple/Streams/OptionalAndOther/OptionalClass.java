package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.OptionalAndOther;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Predicate.Dog;

import java.util.Optional;

public class OptionalClass {

    //    public static void main(String[] args) {
//        Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0);
//        Optional<Double> aNum = doubleStream.findFirst();
//        if (aNum.isPresent()) {
//            System.out.println("First number from the doubles stream: " + aNum.get());
//        } else {
//            System.out.println("Double stream is empty");
//        }
//    }
//    public static void main(String[] args) {
//        Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0);
//        Optional<Double> aNum = doubleStream.findFirst();
//        aNum.ifPresent(n -> System.out.println("First number from the doubles stream: " + n));
//    }
//    public static void main(String[] args) {
//        Dog dog = new Dog("Max",13,7);
//        Optional<Dog> dog1 = Optional.of(dog);
//        dog1.ifPresent(System.out::println);
//    }

//    public static void main(String[] args) {
//        //will be null-pointer exception
//        Optional<Object> optional = Optional.of(null);
//        optional.ifPresent(System.out::println);
//    }

//    public static void main(String[] args) {
//        Dog boi = null;
//        Optional<Dog> optional = Optional.ofNullable(boi);
//        optional.ifPresent(System.out::println);
//        if(!optional.isPresent()){
//            System.out.println("Boi must be null");
//        }
//    }

//    public static void main(String[] args) {
//        Optional<Dog> empty = Optional.empty();//make an empty Dog optional
//        if (!empty.isPresent()) {
//            System.out.println("Empty dog must be empty");
//        }
//        empty.ifPresent(d-> System.out.println("Empty dog is no longer empty"));
//    }

    public static void main(String[] args) {
//        Optional<Dog> empty = Optional.empty();
//        Dog default_dog = empty.orElse(new Dog("Default Dog", 50, 10));
//        System.out.println("A Dog: " + default_dog);

        ////////////////////////////////////////////////
        Dog boi = new Dog("boi", 30,6);
        Optional<Dog> empty = Optional.of(boi);
        Dog aDog = empty.orElse(new Dog("Default Dog", 50, 10));
        System.out.println("A Dog: " + aDog);
    }
}
