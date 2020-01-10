package LambdaExpressionsAndFunctionalInterfaces.DogExemple.FunctionalInterfases.Supplier;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketClass {

    static String host = "coderanch.com";
    static int port = 80;
    //set up logging;
    static Logger logger = Logger.getLogger("Status Logger");

    public static void main(String[] args) {
        logger.setLevel(Level.SEVERE);

        Supplier<String> status = () -> {
            int timeout = 1000;
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), timeout);
                return "up";
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "down";
        };

        try {
            logger.log(Level.INFO, status);
        } catch (Exception e) {
            logger.log(Level.SEVERE, status);
        }
    }


}
