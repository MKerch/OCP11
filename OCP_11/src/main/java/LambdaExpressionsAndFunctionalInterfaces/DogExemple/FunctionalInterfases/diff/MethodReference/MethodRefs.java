package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.diff.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRefs {

    public static void main(String[] args) {
        List<String> trees = Arrays.asList("fir", "cedar", "pine");

        trees.forEach(t -> System.out.println(t));//print with lambda
        trees.forEach(System.out::println);//print with method reference

        trees.forEach(MethodRefs::printTreeStatic);//print with our own static method reference

    }

    private static void printTreeStatic(String t) {
        System.out.println("Tree name: " + t);
    }
}
