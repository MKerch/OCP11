package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.OptionalAndOther;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Reduce {
    static List<Reading> readings = Arrays.asList(
            new Reading(2017, 1, 1, 405.91),
            new Reading(2017, 1, 8, 405.98),
            new Reading(2017, 1, 15, 406.14),
            new Reading(2017, 1, 22, 406.48),
            new Reading(2017, 1, 29, 406.20),
            new Reading(2017, 1, 5, 407.12),
            new Reading(2017, 2, 12, 406.03)
    );

//    public static void main(String[] args) {
//        List<Reading> readings = Arrays.asList(
//                new Reading(2017, 1, 1, 405.91),
//                new Reading(2017, 1, 8, 405.98),
//                new Reading(2017, 1, 15, 406.14),
//                new Reading(2017, 1, 22, 406.48),
//                new Reading(2017, 1, 29, 406.20),
//                new Reading(2017, 1, 5, 407.12),
//                new Reading(2017, 2, 12, 406.03)
//        );
//        OptionalDouble max = readings.stream().mapToDouble(r -> r.value)
//                .max();
//        if (max.isPresent()) {
//            System.out.println("Max of all readings: " + max.getAsDouble());
//        } else {
//            System.out.println("Empty optional!");
//        }
//    }

//    public static void main(String[] args) {
////sum return not an Optional, but min max and average does!
//        List<Reading> readings = Arrays.asList();
//        double sum = readings.stream().mapToDouble(r -> r.value).sum();
//        System.out.println("Sum of all readings: "+ sum);
//
//    }

//    public static void main(String[] args) {
//        List<Reading> readings = Arrays.asList(
//                new Reading(2017, 1, 1, 405.91),
//                new Reading(2017, 1, 8, 405.98),
//                new Reading(2017, 1, 15, 406.14),
//                new Reading(2017, 1, 22, 406.48),
//                new Reading(2017, 1, 29, 406.20),
//                new Reading(2017, 1, 5, 407.12),
//                new Reading(2017, 2, 12, 406.03)
//        );
//        OptionalDouble reduceSum = readings.stream().mapToDouble(r -> r.value)
//                .reduce((v1, v2) -> v1 + v2);
//        if (reduceSum.isPresent()) {
//            System.out.println("Sum of all readings: " + reduceSum.getAsDouble());
//        }
//    }

    public static void main(String[] args) {

        double sum = readings.stream().mapToDouble(r -> r.value)
                .reduce(0.0, (v1, v2) -> v1 + v2);// provide an identity value
        System.out.println("Sum of all readings: " + sum);//print 0.0 if stream is empty

    }
}
