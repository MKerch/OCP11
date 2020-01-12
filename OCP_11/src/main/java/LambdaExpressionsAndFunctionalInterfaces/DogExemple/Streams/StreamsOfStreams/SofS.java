package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.StreamsOfStreams;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.StreamFromFile.DVDInfo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SofS {

    public static void main(String[] args) throws IOException, URISyntaxException {
        String fileName = "java.txt";
        List<DVDInfo> dvds = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemClassLoader()
                .getResource(fileName).toURI()))) {

            long count = stream
                    .map(s->s.split(" "))
                    .flatMap(array -> Arrays.stream(array))
                    .filter(v -> v.equals("Java")).count();
            System.out.println("Number of times Java appears: " + count);

        }
    }
}
