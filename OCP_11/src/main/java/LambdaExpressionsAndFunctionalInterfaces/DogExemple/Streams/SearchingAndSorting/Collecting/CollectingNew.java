package LambdaExpressionsAndFunctionalInterfaces.DogExemple.Streams.SearchingAndSorting.Collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingNew {


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

        List<Person> peopleAge34 = people.stream()
                .filter(p -> p.getAge() == 34)
                //.collect(Collectors.toList()); //or below
                .collect(Collectors.toCollection(ArrayList::new));//or .collect(Collectors.toCollection(()->new ArrayList<Dog>()));
        System.out.println("People aged 34: " + peopleAge34);
    }
}
