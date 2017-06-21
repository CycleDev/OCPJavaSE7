package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.File;

public class javaionio2 {

    private static final String FILE_PATH = "E:\\temp\\testfile.txt";
    private static final String FILE_DIR = "E:\\temp\\";

    public static void testGetPathInfo(){
        PathTest.GetPathInfo(FILE_PATH);
    }

    public static void testCreateFile() {
        FilesTests.createFile(FILE_DIR + "test1.txt");
    }
}
