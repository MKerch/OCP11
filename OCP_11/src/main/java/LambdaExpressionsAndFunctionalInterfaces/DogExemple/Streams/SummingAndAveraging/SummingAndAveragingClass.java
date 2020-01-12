package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SummingAndAveraging;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting.Collecting.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingAndAveragingClass {

    public static void main(String[] args) {
        Person beth = new Person("Beth", 30);
        Person beth2 = new Person("Beth", 45);
        Person eric = new Person("Eric", 31);
        Person deb = new Person("Deb", 31);
        Person liz = new Person("Liz", 30);
        Person wendi = new Person("Wendi", 34);
        Person kathy = new Person("Kathy", 35);
        Person bert = new Person("Bert", 32);
        Person bert2 = new Person("Bert", 38);
        Person bill = new Person("Bill", 34);
        Person bill2 = new Person("Bill", 40);
        Person robert = new Person("Robert", 38);

        List<Person> people = new ArrayList<>();
        people.add(beth);
        people.add(eric);
        people.add(deb);
        people.add(liz);
        people.add(wendi);
        people.add(kathy);
        people.add(bert);
        people.add(bill);
        people.add(robert);
        people.add(bill2);
        people.add(bert2);
        people.add(beth2);


//        Map<String, Integer> sumOfAges = people.stream()                                                //stream people
//                .filter(p -> p.getName().startsWith("B"))              //filter "B" names
//                .collect(                                              //collect to map
//                        Collectors.groupingBy(
//                                Person::getName,
//                                Collectors.summingInt(Person::getAge)
//                        )
//                );
//        System.out.println("People by sum of age: " + sumOfAges);


//        Map<String, Double> avgOfAges = people.stream()                                                //stream people
//                .filter(p -> p.getName().startsWith("B"))              //filter "B" names
//                .collect(                                              //collect to map
//                        Collectors.groupingBy(
//                                Person::getName,
//                                //now average ages instead of sum of ages
//                                Collectors.averagingInt(Person::getAge)
//                        )
//                );
//        System.out.println("People by sum of age: " + avgOfAges);


    }
}
