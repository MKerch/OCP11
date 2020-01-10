package myapp.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainIO {

    public static void main(String[] args) throws IOException {

        File file = new File("max.txt");
//        FileWriter writer = new FileWriter(file);
//        writer.append("Hi");
//        writer.close();
        FileReader reader = new FileReader(file);
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
    }

}
