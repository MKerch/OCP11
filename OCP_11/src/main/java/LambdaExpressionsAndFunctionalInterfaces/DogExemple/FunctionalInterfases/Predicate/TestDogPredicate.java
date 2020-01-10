package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Predicate;

import java.util.function.Predicate;

public class TestDogPredicate {

//    public static void main(String[] args) {
//        ArrayList<Dog> dogs = new ArrayList<>();
//        Dog boi = new Dog("boi", 30, 6);
//        Dog clover = new Dog("clover", 35, 12);
//        Dog aiko = new Dog("aiko", 50, 10);
//        Dog zooey = new Dog("zooey", 45, 8);
//        Dog charis = new Dog("charis", 120, 7);
//
//        dogs.add(boi);
//        dogs.add(clover);
//        dogs.add(aiko);
//        dogs.add(zooey);
//        dogs.add(charis);
//
//        System.out.println("--- All dogs ---");
//        dogs.forEach(d -> System.out.println(d));
//
//        System.out.println("--- Dogs younger than 9 ---");
//        printDogIf(dogs, (d) -> d.getAge() < 9);
//
//        System.out.println("--- Dogs 9 or older ---");
//        printDogIf(dogs, (d) -> d.getAge() >= 9);
//    }
//
//    public static void printDogIf(ArrayList<Dog> dogs, Predicate<Dog> p) {
//        for (Dog d : dogs) {
//            if (p.test(d)) {
//                System.out.println(d);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        ArrayList<Dog> dogs = new ArrayList<>();
//        Dog boi = new Dog("boi", 30, 6);
//        Dog clover = new Dog("clover", 35, 12);
//        Dog aiko = new Dog("aiko", 50, 10);
//        Dog zooey = new Dog("zooey", 45, 8);
//        Dog charis = new Dog("charis", 120, 7);
//
//        dogs.add(boi);
//        dogs.add(clover);
//        dogs.add(aiko);
//        dogs.add(zooey);
//        dogs.add(charis);
//        Predicate<Dog> findCs = d -> d.getName().startsWith("c");
//        dogs.removeIf(findCs);
//        System.out.println("--- After removing dogs whose names begin with c ---");
//        dogs.forEach(d -> System.out.println(d));
//    }

//    public static void main(String[] args) {
//        //negate is opposite
//        Dog boi = new Dog("boi", 30, 6);
//        Predicate<Dog> age = d -> d.getAge() == 6;
//        System.out.println("Is boi NOT 6? " + age.negate().test(boi));
//    }

//    public static void main(String[] args) {
//        Dog boi = new Dog("boi", 30, 6);
//        Predicate<Dog> name = d -> d.getName().equals("boi");
//        Predicate<Dog> age = d -> d.getAge() == 6;
//        Predicate<Dog> nameAndAge = d -> name.and(age).test(boi);
//        //Predicate<Dog> nameAndAge2 = name.and(age);
//        System.out.println("--- Test name and age of boi ---");
//        System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));
//        boi.setAge(7);
//        System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));
//
//    }

    public static void main(String[] args) {
        Dog aiko = new Dog("aiko", 50, 10);
        Dog zooey = new Dog("zooey", 45, 8);
        Dog boi = new Dog("boi", 30, 6);

        Predicate<Dog> p = Predicate.isEqual(zooey);
        System.out.println("Is aiko the same object as zooey? " + p.test(aiko));
        System.out.println("Is zooey the same object as zooey? " + p.test(zooey));

    }
}
