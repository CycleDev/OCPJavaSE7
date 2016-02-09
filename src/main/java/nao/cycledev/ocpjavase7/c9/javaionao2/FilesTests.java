package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTests {

    public static void createFile(String filePath) {

        try {
            Files.createFile(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
