package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    public static void GetPathInfo(String fileName){

        Path path = Paths.get(fileName);

        System.out.println("File system name: " + path.getFileSystem());
        System.out.println("File name: " + path.getFileName());
        System.out.println("File root: " + path.getRoot());
        System.out.println("File parent: " + path.getParent());

        for (Path element:path){
            System.out.println("\telement: " + element);
        }
    }
}
