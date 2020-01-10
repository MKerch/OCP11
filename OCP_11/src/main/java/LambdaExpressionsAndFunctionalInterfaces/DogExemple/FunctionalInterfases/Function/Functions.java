package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Function;

import java.util.Map;
import java.util.TreeMap;

public class Functions {
    public static void main(String[] arg) {
        Map<String, String> aprilWinner = new TreeMap<>();
        aprilWinner.put("April 2017", "Bob");
        aprilWinner.put("April 2016", "Annette");
        aprilWinner.put("April 2015", "Lamar");

        System.out.println("--- List, before checking April 2014 ---");
        aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));

        //no key for April 2014, so John Doe gets added to the map
        aprilWinner.computeIfAbsent("April 2014", (k) -> "John Doe");

        //key April 2014 now has a value, so Jane won't be added
        aprilWinner.computeIfAbsent("April 2014", (k) -> "John Doe");

        System.out.println("--- List, after checking April 2014 ---");
        aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));

        //use a biFunction to replace all values in the map with
        //uppercase value
        aprilWinner.replaceAll((key, oldValue) -> oldValue.toUpperCase());
        System.out.println("---List, after replacing value with uppercase ---");
        aprilWinner.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
