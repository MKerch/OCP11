package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.CountingJoiningMaxByMinBy;

import LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting.Collecting.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class CountingClass {

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

//        Long n = people.stream().collect(Collectors.counting());
//        System.out.println("Count: " + n);

//        String older34 = people.stream()                   //stream people
//                .filter(p -> p.getAge() > 34)              //filter for older than 34
//                .map(Person::getName)                      //map Person to name
//                .collect(Collectors.joining(",")); //join names into one string
//        System.out.println("Name of people older tha 34: " + older34);

//        Optional<Person> oldest = people.stream()
//                .collect(Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge()));
//        oldest.ifPresent(p -> System.out.println("Oldest person: " + p));

        OptionalInt max = people.stream()
                .mapToInt(p -> p.getAge()).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }
        /*By using maxBy() with collect(), we can find the Person object who
        has the highest age and get the whole Person back, not just their age. (We
        could also use the Stream.max() method and provide a comparator to do
            essentially the same thing.)*/
    }
}
