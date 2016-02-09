package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.File;

public class javaionio2 {

    private static final String FILE_PATH = "C:\\temp\\testfile.txt";
    private static final String FILE_DIR = "C:\\temp\\";

    public static void testGetPathInfo(){
        PathTest.GetPathInfo(FILE_PATH);
    }

    public static void testCreateFile() {
        FilesTests.createFile(FILE_DIR + "test1.txt");
    }
}
