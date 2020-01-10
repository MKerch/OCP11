package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Predicate;

import java.util.function.Predicate;

public class main {

//    public static void main(String[] args) {
////        DogQuerier dogQuerier = new DogQuerier() {
////            @Override
////            public boolean test(Dog d) {
////                return d.getAge() > 9;
////            }
////        };
//
//        DogQuerier querier = d -> d.getAge()>9;
//    }

    public static void main(String[] args) {

        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);

        Predicate<Dog> p = d -> d.getAge() > 9;
        System.out.println("Is Boi older than 9? "+ p.test(boi));
        System.out.println("Is Clover older than 9? "+ p.test(clover));

    }
}
