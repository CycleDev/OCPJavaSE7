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

    public static void createDirectory(String dir) throws IOException {

        Files.createDirectory(Paths.get(dir));
    }

    public static void createDirectories(String dir) throws IOException {

        Files.createDirectories(Paths.get(dir));
    }
}
