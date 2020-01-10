package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer.Dog;

public class Dog {

    private String name;
    private int age;
    private int weight;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}
