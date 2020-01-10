package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Supplier;

import java.util.Random;
import java.util.function.IntSupplier;

public class main {

//    public static void main(String[] args) {
//
//        Supplier<Integer> supplier = () -> 42;
//        System.out.println("Answer to everything: " + supplier.get());
//    }

//    public static void main(String[] args) {
//        Supplier<Integer> supplier = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                return 42;
//            }
//        };
//
//    }

//    public static void main(String[] args) {
//        Supplier<String> supplier = () ->{
//
//            Map<String, String> env = System.getenv();
//            return env.get("USERNAME");
//        };
//        System.out.println("User is: " + supplier.get());
//    }

    public static void main(String[] args) {

        Random random = new Random();
        IntSupplier randomIntSupplier = () -> random.nextInt(50);
        int myRandom = randomIntSupplier.getAsInt();
        System.out.println(myRandom);

    }

}
