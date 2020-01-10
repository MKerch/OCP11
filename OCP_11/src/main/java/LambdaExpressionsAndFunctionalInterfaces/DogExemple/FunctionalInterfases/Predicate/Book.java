package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Predicate;

public class Book {

    private Double price;
    private String name;

    public Book(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
