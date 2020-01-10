package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.diff.MethodReference;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<String> trees = Arrays.asList("fir", "cedar", "pine");
        //trees.forEach(t -> System.out.println(t));
        trees.forEach(System.out::println);
    }

}
