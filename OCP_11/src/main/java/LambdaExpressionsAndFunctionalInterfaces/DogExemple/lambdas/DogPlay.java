package LambdaExpressionsAndFunctionalInterfaces.DogExemple.lambdas;

public class DogPlay {

    DogQuerier dogQuerier;

    public DogPlay(DogQuerier dogQuerier) {
        this.dogQuerier = dogQuerier;
    }

    public boolean doQuery(Dog d) {
        return dogQuerier.test(d);
    }

    class Inner {
        DogPlay dp = new DogPlay(d -> d.getAge() > 9);
//        When we call dp.doQuery() and pass in a dog, the test() method of the
//        DogQuerier gets called:
//        And we see the output:
//        The lambda expression we’re passing to DogsPlay is simple; it has one
//        Dog parameter and simply tests that dog’s age and returns true or false.
    }


    public static void main(String[] args) {

//        int numCats = 3;
//        DogQuerier dogQuerier = d -> {
//            int numBalls = 1; //completely new variable local to lambda
//            numBalls++; //can modify numBalls
//            System.out.println("Number of balls: " + numBalls); //can access numBalls
//            System.out.println("Number of cats: " + numCats); //can access numCats
//            return d.getAge() > 9;
//        };


//        int numCats = 3;
//        int numBalls = 1; //now we have numBalls in enclosing scope
//        DogQuerier dogQuerier = d -> {
//            int numBalls = 5; //wont compile! Trying to redeclare numBalls
//            System.out.println("Number of balls: " + numBalls);
//            System.out.println("Number of cats: " + numCats);
//            return d.getAge() > 9;
//        };

//        int numCats;
//        DogQuerier dogQuerier2 = d -> {
//            int numBalls = 5;
//            //numCats++; wont compile;
//            System.out.println("Number of balls: " + numBalls);
//            System.out.println("Number of cats: " + numCats);
//            return d.getAge() > 9;
//        };

        int numCats = 4;// numCats is effectively final
        DogQuerier dogQuerier2 = d -> {
            int numBalls = 5;
            System.out.println("Number of balls: " + numBalls);
            System.out.println("Number of cats: " + numCats);
            return d.getAge() > 9;
        };

    }

}
