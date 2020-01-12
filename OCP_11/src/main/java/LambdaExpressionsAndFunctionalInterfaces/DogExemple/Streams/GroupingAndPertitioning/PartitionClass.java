package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.GroupingAndPertitioning;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting.Collecting.Person;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionClass {

    public static void main(String[] args) {
        Person beth = new Person("Beth", 30);
        Person eric = new Person("Eric", 31);
        Person deb = new Person("Deb", 31);
        Person liz = new Person("Liz", 30);
        Person wendi = new Person("Wendi", 34);
        Person kathy = new Person("Kathy", 35);
        Person bert = new Person("Bert", 32);
        Person bill = new Person("Bill", 34);
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

        Map<Boolean, List<Person>> peopleOlderThan34 = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() > 34));

        System.out.println("People > 34: " + peopleOlderThan34);


    }
}