package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Function;

import java.util.function.Function;

public class main {
//    public static void main(String[] args) {
//
//        Function<Integer, String> answer = a -> {
//            if (a == 42) return "forty-two";
//            else return "No answer for you";
//        };
//        System.out.println(answer.apply(42));
//        System.out.println(answer.apply(62));
//    }

    public static void main(String[] args) {

        Function<Integer, Integer> id = Function.identity();
        System.out.println(id.apply(42));

    }


}
