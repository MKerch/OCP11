package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Consumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class ConsumersClass {

    public static void main(String[] args) {

        Map<String, String> env = System.getenv();
        User user = new User();
        BiConsumer<String, String> findUserName = (key, value) -> {
            if (key.equals("USERNAME")) user.setUsername(value);
        };
        env.forEach(findUserName);
        System.out.println("Username from env: " + user.getUsername());
    }
}

class User {

    String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

}
