package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.OptionalAndOther;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
        List<Reading> readings = Arrays.asList(
                new Reading(2017, 1, 1, 405.91),
                new Reading(2017, 1, 8, 405.98),
                new Reading(2017, 1, 15, 406.14),
                new Reading(2017, 1, 22, 406.48),
                new Reading(2017, 1, 29, 406.20),
                new Reading(2017, 1, 5, 407.12),
                new Reading(2017, 2, 12, 406.03)
        );
        OptionalDouble avg = readings.stream().mapToDouble(r -> r.value)
                .filter(v -> v >= 406.0 && v < 407.00).average();
        if (avg.isPresent()) {
            System.out.println("Average of 406 readings: " + avg.getAsDouble());
        } else {
            System.out.println("Empty optional!");
        }
    }
}
