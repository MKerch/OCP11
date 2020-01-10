package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.diff.UnaryOparator;

import java.util.function.UnaryOperator;

public class UnaryOperatorClass {

    public static void main(String[] args) {

        UnaryOperator<Double> log2 = v -> Math.log(v) / Math.log(2);
        System.out.println(log2.apply(8.0));
    }
}
