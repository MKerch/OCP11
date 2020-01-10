package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Your Brain is Better with Java", 58.99);
        Book book2 = new Book("OCP8 Java Certification Study Guide", 53.99);
        Book book3 = new Book("Is Java Coffee or Programming", 39.86);
        Book book4 = new Book("While you were out Java happened", 12.99);
        books.add(book1);books.add(book2);
        books.add(book3);books.add(book4);
        BiPredicate<String, Double> javaBuy = (name, price) -> name.contains("Java");
        BiPredicate<String, Double> priceBuy = (name, price) -> price < 55.00;
        BiPredicate<String, Double> definitelyBuy = javaBuy.and(priceBuy);
        books.forEach(book -> {
            if (definitelyBuy.test(book.getName(), book.getPrice())) {
                System.out.println("You should definitely buy " + book.getName() + "(" + book.getPrice() + ")");
            }
        });
    }
}
