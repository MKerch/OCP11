package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.GenerateStreams;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Stream.iterate(0, s -> s + 1)
//                .forEach(System.out::println); //infinite stream dont run at home


        Stream.iterate(0, s -> s + 1)
                .limit(4) //limit it to 4
                .forEach(System.out::println);
    }
}
