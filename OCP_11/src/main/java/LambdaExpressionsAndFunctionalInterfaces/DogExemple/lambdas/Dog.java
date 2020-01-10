package LambdaExpressionsAndFunctionalInterfaces.DogExemple.lambdas;

public class Dog {

    private int age;
    private String name;
    private int weight;

    public Dog(String name, int weight, int age) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }


}
