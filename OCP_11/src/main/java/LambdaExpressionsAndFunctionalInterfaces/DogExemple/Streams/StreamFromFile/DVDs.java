package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.StreamFromFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//will not work, file does nor exist
public class DVDs {

    //    public static void main(String[] args) throws IOException {
//
//        List<DVDInfo> dvds = loadDVDs("dvdinfo.txt");//load the DVDs from file
//        dvds.forEach(System.out::println);//just print the DVDs
//    }
//
//    private static List<DVDInfo> loadDVDs(String fileName) throws IOException {
//        List<DVDInfo> dvds = new ArrayList<DVDInfo>();
//        //stream a file, line by line
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//            stream.forEach(line -> {//use foreach to display each line
//                String[] dvdsItems = line.split("/");
//                DVDInfo dvd = new DVDInfo(dvdsItems[0], dvdsItems[1], dvdsItems[2]);
//                dvds.add(dvd);//
//            });
//            return dvds;
//        }
//
//    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String fileName = "names.txt";
        List<DVDInfo> dvds = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemClassLoader()
                .getResource(fileName).toURI()))) {

                List<String> data = stream.collect(Collectors.toList());
                data.forEach(System.out::println);
        }
    }
}
