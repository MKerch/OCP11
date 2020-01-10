package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {
//    public static void main(String[] args) {
//
//        Consumer<String> consumer = pill -> {
//            if (pill.equals("red")) {
//                System.out.println("Down the rabbit hole");
//            }else  if(pill.equals("blue")){
//                System.out.println("Stay in lala land");
//            }
//        };
//        consumer.accept("red");
//    }

//    public static void main(String[] args) {
//        //biconsumer
//        Map<String, String> env = System.getenv();
//
//        BiConsumer<String, String> printEnv = (key, value) -> {
//            System.out.println(key + " " + value);
//        };
//        printEnv.accept("USERNAME", env.get("USERNAME"));
//    }

//    public static void main(String[] args) {
//        List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
////        Consumer<String> printName = name -> System.out.println(name);
////        dogNames.forEach(printName);
//        dogNames.forEach(name -> System.out.println(name));
//    }

//    public static void main(String[] args) {
//        Map<String, String> map = System.getenv();
//        BiConsumer<String, String> biConsumer = (key, value) -> {
//            System.out.println(key + ": " + value);
//        };
//        map.forEach(biConsumer);
//    }

    public static void main(String[] args) {
        String userName;
        BiConsumer<String, String> findUserName = (key, value)->{
          //if(key.equals("USER")) username = value;//compile error!
        };                                        //username must be
                                                  //effectively final

    }
}
