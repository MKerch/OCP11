package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.ParralelStreams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = list.stream()
//                .parallel().mapToInt(n -> n).sum();
//        System.out.println("Sum is " + sum);

        List<String> strings = Arrays.asList("A", "B", "C");
        strings.stream().parallel().forEach(System.out::println);//parallel wont guarantee the order
    }

}
