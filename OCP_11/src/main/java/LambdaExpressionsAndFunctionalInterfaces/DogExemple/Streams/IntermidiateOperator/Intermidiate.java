package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.IntermidiateOperator;

import java.util.Arrays;
import java.util.List;

public class Intermidiate {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Boi", "Charis", "Bokeh","Zooey","Clover", "Aiko");
        names.stream().filter(s->s.startsWith("B")||s.startsWith("C"))
                .filter(s->s.length()>3).forEach(System.out::println);
    }

}
