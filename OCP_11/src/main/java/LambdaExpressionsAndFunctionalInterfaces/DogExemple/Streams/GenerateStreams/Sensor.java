package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.GenerateStreams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sensor {

    private String value = "up";
    private int i = 0;

    public Sensor() {
    }

    public String next() {
        i = i + 1;
        return i > 10 ? "down" : "up";
    }
}

class SensorTest {

//    public static void main(String[] args) {
//        Sensor sensor = new Sensor();
//        Optional<String> down = Stream.generate(() -> sensor.next())
//                .filter(v -> v.equals("down")).findFirst();
//        if(down.isPresent()){
//            System.out.println("down is founded "+ down.get().equals("down"));
//        }
//
//    }

    public static void main(String[] args) {
//        IntStream nunStream = IntStream.range(10,15);//generate numbers 10...14
//        nunStream.forEach(System.out::println);

//        IntStream nunStream = IntStream.rangeClosed(10, 15);//generate numbers 10...14
//        nunStream.forEach(System.out::println);

//        IntStream steam = IntStream.rangeClosed(0, 20)
//                .filter(i -> i % 2 == 0)
//                .limit(5);
//        steam.forEach(System.out::println);

        IntStream steam = IntStream.rangeClosed(0, 20)
                .filter(i -> i % 2 == 0)
                .skip(5);
        steam.forEach(System.out::println);
    }
}
