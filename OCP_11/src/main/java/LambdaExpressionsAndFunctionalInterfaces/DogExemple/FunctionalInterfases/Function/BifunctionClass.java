package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Function;

import java.util.function.BiFunction;

public class BifunctionClass {

    public static void main(String[] args) {
        BiFunction<String, String, String> firstLast =
                (first, last) -> first + " " + last;
        System.out.println("First and Last name: "
                + firstLast.apply("Joe","Smith"));
    }
}
