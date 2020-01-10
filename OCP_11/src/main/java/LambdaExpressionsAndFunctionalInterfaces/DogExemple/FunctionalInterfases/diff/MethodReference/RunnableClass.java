package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.diff.MethodReference;

public class RunnableClass {

    public static void main(String[] args) {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Do this");
//            }
//        };

        Runnable r = () -> System.out.println("Do this");
    }
}
