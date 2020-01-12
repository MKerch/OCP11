package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExample {

//    public static void main(String[] args) {
//        List<Double> tempsInPhoenix = Arrays.asList(123.6, 118.0, 113.0, 112.5, 115.8, 117.0, 110.2, 110.1, 106.0, 106.4);
//        System.out.println("Number of days over 110 in 10 day period: " + tempsInPhoenix.stream()
//                .filter(t -> t > 110.0).count());
//    }

    public static void main(String[] args) {
//turn map to set to get the stream from it
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Boi", 6);
        myMap.put("Zooey", 3);
        myMap.put("Charis", 8);
        System.out.println("Number of items in the map with value > 4: " +
                myMap.entrySet().stream().filter(d -> d.getValue() > 4).count());
    }
}
