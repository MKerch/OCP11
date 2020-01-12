package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer.Dog.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {

//    public static void main(String[] args) {
//        Integer[] myNums = {1, 2, 3};
//        Stream<Integer> myStream = Arrays.stream(myNums);
//        System.out.println(myStream);
//
//    }

    //public static void main(String[] args) {
//        Integer[] myNums = {1, 2, 3};
//        Stream<Integer> myStream = Arrays.stream(myNums);
//        long count = myStream.count();
//        System.out.println("Number of elements in the stream: " + count);
//    }

//    public static void main(String[] args) {
//        Integer[] myNums = {1, 2, 3};
//        Stream<Integer> myStream = Arrays.stream(myNums);
//        long count = myStream.
//                filter((i) -> i > 1)//add an intermediate operator to filter the stream
//                .count();           //terminal operation, count the elements in a stream
//        System.out.println("Number of elements > 1: " + count);
//    }

//    public static void main(String[] args) {
//        Integer[] myNums = {1, 2, 3};
//        Stream<Integer> myStream = Arrays.stream(myNums);
//        long numElements = myStream.filter((i) -> i > 1).count();
//        System.out.println("Number of elements>1: " + numElements);
//        numElements = myStream.filter((i) -> i > 2).count();
//        System.out.println("Number of elements>2: " + numElements);
//
//        //Run that code and you’ll get an exception:
//        //java.lang.IllegalStateExeption: Stream has already been operated upon or closed
//    }

//    public static void main(String[] args) {
//        Integer[] myNums = {1, 2, 3};
//        Stream<Integer> myStream = Arrays.stream(myNums);
//        long numElements = myStream.filter((i) -> i > 1).count();
//        System.out.println("Number of elements>1: " + numElements);
//        numElements = Arrays.stream(myNums).filter((i) -> i > 2).count();
//        System.out.println("Number of elements>2: " + numElements);
//
//    }

    ////public static void main(String[] args) {
    //java 7
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        long result = 0;
//        for (Integer i : nums) {
//            int square = i * i;
//            if (square > 20) {
//                result += result;
//            }
//            System.out.println("Square of " + i + " is: " + square);
//        }
//        System.out.println("Result: " + result);

//        //java 8
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        long count = nums.stream().map(n -> n * n).filter(n -> n > 20).count();
//        System.out.println(count);

    ////}

//    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        long count = nums.stream()
//                .peek(n -> System.out.print("Number is: " + n + ", "))//print the number
//                .map(n -> n * n).filter(n -> n > 20)
//                .peek(n -> System.out.print("Square is: " + n + ", "))//print the square
//                .count();
//    }

//    public static void main(String[] args) {
//
////do not try to modify the source
////do not delete the elements from the within stream
////example below is not recommended
//        List<Dog> dogs = new ArrayList<>();
//        dogs.stream().filter(dog -> {
//            if (dog.getWeight() < 50) {
//                dogs.remove(dog);
//                return false;
//            }
//            return true;
//        }).forEach(System.out::println);
//    }

}
