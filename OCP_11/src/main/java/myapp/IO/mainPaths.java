package myapp.IO;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class mainPaths {
    public static void main(String[] args) {

        Path path = Paths.get("c:", "temp");
        Path path2 = FileSystems.getDefault().getPath("myapp");
        Iterator<Path> iterator = path2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(path2.iterator());
    }
}
